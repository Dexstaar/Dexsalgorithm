package com.dexstaar.codility;

import java.util.HashMap;

public class EquiLeader1 {
	public EquiLeader1(){
		
	}
	
	public int solution(int[] A) {
        // write your code in Java SE 8
		
		// 각 elem별 카운트를 구해서 equi leader의 value 를 구함
		HashMap map = new HashMap();
		
		for(int i=0; i<A.length; i++){
			if(map.containsKey(A[i])){
				int currVal = (int)map.get(A[i]);
				map.put(A[i], currVal);
			}else{
				map.put(A[i], 1);
			}
		}
		
		
		
		return 0;
		
		// equi leader value의 횟수가 다른 것보다 많이 나오는 순간 짤라
		// 짜를때마다 카운트 
    }
}
