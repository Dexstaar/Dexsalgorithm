package com.dexstaar.codility;

public class TapeEquilibrium1 {
	public TapeEquilibrium1(){
		
	}
	
	public int solution(int[] A) {
        // write your code in Java SE 8
		int minimum = 0;
		int sum = 0;
		
		for(int i=0; i<A.length; i++){
			sum += A[i];
		}
		
		int untilSum = 0;
		int gap = 0;
		
		for(int i=0; i<A.length; i++){
			untilSum += A[i];
			gap = Math.abs(sum - untilSum * 2);
			
			if(minimum == 0 || minimum > gap) minimum = gap;
		}
		
		return minimum;
    }
}
