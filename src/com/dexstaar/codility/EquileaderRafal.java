package com.dexstaar.codility;

/**
 * This is Rafal's Answer for Codility Lesson 6: Distinct
 */
public class EquileaderRafal {
    public int solution(int[] a) {
        int len = a.length;
        int equi_leaders = 0;

        //first, compute the leader
        int leader = a[0];
        int ctr = 1;

        for(int i=1; i<a.length; i++){
            if(a[i] == leader){
                ctr++;
            }else{
                ctr--;
            }

            if(ctr == 0){
                ctr = 1;
                leader = a[i];
            }
        }

        //check if it's a leader?

        //리더가 전체 몇번인지 구한다
        int total = 0;
        for(int i : a){
            if(i == leader) total++;
        }

        // 리더가 전체 반이상 있지 않으면 구할수가 없다
        if(total <= (len/2)) return 0;

        int ldrCount = 0;
        for(int i=0; i<a.length; i++){
            if(a[i] == leader) ldrCount++;
            int leadersInRightPart = (total - ldrCount);
            if(ldrCount > (i+1)/2 && leadersInRightPart > (len-i-1)/2){
                equi_leaders++;
            }
        }

        return equi_leaders;
    }

}
