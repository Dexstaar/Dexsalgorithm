package com.dexstaar.question;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class MathTest {

    public static void main(String[] args) {
// TODO Auto-generated method stub
//XYZ+XY = 6PP
        MathTest mt = new MathTest();

        String p = "AA";
        String q = "BC";
        String r = "CD";

        List<String> opArr1 = mt.getNum(p);
        List<String> opArr2 = mt.getNum(q);
        List<String> rstArr = mt.getNum(r);

        List<String> opList1 = new ArrayList<String>();
        for(int i = 0 ; i < opArr1.size() ; i++){
            boolean flag = mt.checkPattern(opArr1.get(i), p);
            if(flag){
                opList1.add(opArr1.get(i));
            }
        }

        List<String> opList2 = new ArrayList<String>();
        for(int i = 0 ; i < opArr2.size() ; i++){
            boolean flag = mt.checkPattern(opArr2.get(i), q);
            if(flag){
                opList2.add(opArr2.get(i));
            }
        }

        List<String> rstList = new ArrayList<String>();
        for(int i = 0 ; i < rstArr.size() ; i++){
            boolean flag = mt.checkPattern(rstArr.get(i), r);
            if(flag){
                rstList.add(rstArr.get(i));
            }
        }

        for(int i = 0 ; i < opList1.size() ; i++){
            for(int j = 0 ; j < opList2.size() ; j++){
                for(int k = 0 ; k < rstList.size() ; k++){
                    String op1 = opList1.get(i);
                    String op2 = opList2.get(j);
                    String rst = rstList.get(k);
                    if(!mt.checkPattern(op1+op2+rst, p+q+r)){
                        continue;
                    }
                    if(Integer.parseInt(op1) + Integer.parseInt(op2) == Integer.parseInt(rst)){
                        System.out.println(op1 + " + " + op2 + " = " + rst);
                    }
                }
            }
        }
    }

    public boolean checkPattern(String str, String p){
        Map<Character, Character> map = new HashMap<Character, Character>();
        char[] pArr = p.toCharArray();
        boolean flag = true;
        for(int i = 0 ; i < pArr.length ; i++){
            if(Character.isDigit(pArr[i])){
                if(pArr[i] != str.charAt(i)){
                    flag = false;
                    return flag;
                }
            }else{
                if(!map.containsKey(pArr[i])){
                    if(map.containsValue(str.charAt(i))){
                        flag = false;
                        break;
                    }
                    map.put(pArr[i], str.charAt(i));
                }else{
                    if(map.get(pArr[i]) != str.charAt(i)){
                        flag = false;
                        break;
                    }
                }
            }
        }
        return flag;
    }

    public List<String> getNum(String str){
        int len = str.length();
        int max = (int)Math.pow(10,  len);
        int min = max / 10;
        List<String> strList = new LinkedList<String>();

        for(int i = min ; i < max ; i++){
            strList.add(String.valueOf(i));
        }

        return strList;
    }

}
