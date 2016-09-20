package com.dexstaar.algorithm.resursion;

public class Permutations {
    private boolean[] used;
    private StringBuilder out = new StringBuilder();
    private final String in;

    public Permutations(final String str){
        in = str;
        used = new boolean[in.length()];
    }

    public void permute(){
        System.out.println(out);

        //마지막 위치를 지나갔으면
        if(out.length() == in.length()){
            //문자열 출력
            System.out.println("output = "+out);
            return;
        }

        for(int i=0; i<in.length(); i++){
            //사용한 것으로 표시되어 있으면 다음 글자로 넘어감
            if(used[i]) continue;
            //그렇지 않으면 그 글자를 현재 위치에 집어넣음
            out.append(in.charAt(i));
            // 그 글자를 사용한 것으로 표시
            used[i] = true;
            //현재위치 +1 위치에서 시작하여 나머지 글자들을 나열
            permute();
            // 그 글자를 사용하지 않은 것으로 표시
            used[i] = false;
            out.setLength(out.length() - 1);
        }
    }


}
