
package com.dexstaar.codility;

public class EquiLeader {
    public int solution(int[] A) {

        int aLength = A.length;

        // leader 를 구한다
        int count = 1;
        int leader = A[0];

        for(int elem : A){
            if(leader == elem){
                count++;
            }else{
                count--;
            }

            if(count == 0){
                leader = elem;
                count++;
            }
        }

        // leader 가 몇개인지 구한다
        int totalLeader = 0;
        for(int elem : A){
            if(leader == elem) totalLeader++;
        }

        if(totalLeader <= aLength/2) return 0;


        // 각 leader의 카운트가 전체갯수의 반이 넘는지 구한다
        int leaderCnt = 0;
        int equiLeader = 0;

        for(int i=0; i<aLength; i++){
            if(A[i] == leader) leaderCnt++;

            if(leaderCnt > (i+1)/2 && totalLeader-leaderCnt > (aLength-i-1)/2) equiLeader++;
        }

        return equiLeader;
    }
}

