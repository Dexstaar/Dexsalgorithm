package com.dexstaar.codility;


public class MissingInteger {
	public MissingInteger(){
		
	}
	
	public int solution(int[] A) {
        // write your code in Java SE 8
		int result = 1;
		
		int[] counter = new int[A.length+1];
		
		for(int i=0; i<A.length; i++){
			counter[A[i]] = counter[A[i]] + 1;
			//System.out.println("counter["+A[i]+"] = "+counter[A[i]]);
		}
		
		for(int i=1; i<counter.length; i++){
			if( counter[i] == 0 ) result = i;
		}
		
		return result;
    }
}
