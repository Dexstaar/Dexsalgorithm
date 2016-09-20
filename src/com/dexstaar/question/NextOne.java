package com.dexstaar.question;

import java.util.Arrays;
import java.util.HashMap;

public class NextOne {

    public void solution(int[] posA, int[] posB, int[] posC){

        // Map에 위치와 단어 정보를 담는다
        HashMap<Integer,String> map = new HashMap<Integer, String>();

        for(int elemA : posA){
            map.put(elemA, "A");
        }

        for(int elemB : posB){
            map.put(elemB, "B");
        }

        for(int elemC : posC){
            map.put(elemC, "C");
        }

        //세개의 배열을 하나로 합침
        int[] posAll = concatArr(posA, posB, posC);
        Arrays.sort(posAll);

        int locA = 0;
        int locB = 0;
        int locC = 0;
        int dis = 0;
        int minDis = 0;
        int minPos = 0;
        int maxPos = 0;

        // loop 문으로 distance가 최단인 경우를 찾는다
        for(int i=0; i<posAll.length; i++){

            if(map.get(posAll[i]) != null){
                if("A".equals(map.get(posAll[i]))) locA = posAll[i];
                if("B".equals(map.get(posAll[i]))) locB = posAll[i];
                if("C".equals(map.get(posAll[i]))) locC = posAll[i];
            }

            if(locA != 0 && locB != 0 && locC != 0){
                dis = getMaxGap(locA, locB, locC);

                if(minDis == 0){
                    minDis = dis;
                    minPos = getMinValue(locA, locB, locC);
                    maxPos = minPos + dis;
                }else{
                    if(minDis > dis){
                        minDis = dis;
                        minPos = getMinValue(locA, locB, locC);
                        maxPos = minPos + dis;
                    }
                }

            }

        }

        System.out.println(minPos+","+maxPos+" 에 있고 거리는 "+ minDis+"이다.");
    }


    //세개의 배열을 합침
    private int[] concatArr(int[] arrA, int[] arrB, int[] arrC){
        int lengthA = arrA.length;
        int lengthB = arrB.length;
        int lengthC = arrC.length;

        int[] rtnArr = new int[lengthA + lengthB + lengthC];

        for(int i=0; i<lengthA; i++){
            rtnArr[i] = arrA[i];

        }

        for(int i=lengthA; i<lengthA+lengthB; i++){
            rtnArr[i] = arrB[i-lengthA];
        }

        for(int i=lengthA+lengthB; i<lengthA+lengthB+lengthC; i++){
            rtnArr[i] = arrC[i-lengthA-lengthB];
        }

        return rtnArr;
    }


    //세 정수 사이의 가장 큰 갭을 구함
    private int getMaxGap(int a, int b, int c){
        int max = a;
        int min = a;

        if(max < b) max = b;
        if(max < c) max = c;

        if(min > b) min = b;
        if(min > c) min = c;

        return max - min;
    }

    //세 정수 사이의 최소값
    private int getMinValue(int a, int b, int c){
        int min = a;

        if(min > b) min = b;
        if(min > c) min = c;

        return min;
    }


}
