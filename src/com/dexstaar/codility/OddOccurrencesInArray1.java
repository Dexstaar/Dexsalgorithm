package com.dexstaar.codility;

import java.util.HashMap;

public class OddOccurrencesInArray1 {
	public OddOccurrencesInArray1(){
		
	}
	
	public int solution(int[] A) {
        // write your code in Java SE 8
		int returnNum = 0;
		
		HashMap map = new HashMap();
		
		for(int i=0; i<A.length; i++){
			//System.out.println( map.get(A[i]) );
			
			if( map.get(A[i]) == null ){
				map.put(A[i], 1);
				returnNum = A[i];
				
			}else{
				map.remove(A[i]);
			}
		}
		
		return returnNum;
    }
}
