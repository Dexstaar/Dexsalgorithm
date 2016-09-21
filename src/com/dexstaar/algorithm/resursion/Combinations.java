package com.dexstaar.algorithm.resursion;

public class Combinations {
    private StringBuilder out = new StringBuilder();
    private final String in;

    public Combinations(final String str){
        in = str;
    }

    public void combine(){
        combine(0);
    }

    private void combine(int start){
        //입력 문자열 시작 부터 끝 loop
        for(int i=start; i<in.length(); i++){
            System.out.println("in.charAt(i) ="+ in.charAt(i));
            //출력 문자열의 현재 위치에 그 글자를 선택
            out.append(in.charAt(i));
            //글자들을 출력 문자열로 출력
            System.out.println(out);
            //System.out.println("i = "+i+"| in.length = "+in.length());
            //현재 글자가 입력 글자열의 마지막이 아니면
            if(i < in.length()){
                //방금 선택한 글자 다음 글자에서 반복을 시작하여 다음 위치부터 시작하는 나머지 조합 생성
                combine(i+1);
            }
            //출력 문자열의 마지막 문자 삭제
            out.setLength(out.length()-1);
        }
    }
}
