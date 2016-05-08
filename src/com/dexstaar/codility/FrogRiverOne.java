package com.dexstaar.codility;

import java.util.HashMap;

public class FrogRiverOne {
	public FrogRiverOne(){
		
	}
	
	public int solution(int X, int[] A){
		
		// 전체의 합
		int sum = ((X + 1) * X) / 2;
		int total = 0;
		int returnNum = -1;
		
		//System.out.println("sum = "+sum);
		
		HashMap map = new HashMap();
		
		// for 문으로 돌려서 그의 합이 전체의 합과 같아지는 시점에서 i를 리턴
		// 단, 합을 구할때 중복으로 더해지면 안됨.
		for(int i=0; i<A.length; i++){
			if(map.get(A[i]) == null) {
				map.put(A[i], true);
				total += A[i];
				
				if(total == sum) returnNum = i;
			}
			//System.out.println("map.get(A["+i+"]) = "+ map.get(A[i]) + " | total = "+total );
		}
		
		return returnNum;
	}
	
}
