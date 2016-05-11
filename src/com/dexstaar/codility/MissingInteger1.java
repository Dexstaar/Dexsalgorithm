package com.dexstaar.codility;

import java.util.Arrays;

public class MissingInteger1 {
	public MissingInteger1(){
		
	}
	
	public int solution(int[] A) {
        // write your code in Java SE 8
		int minValue = 1;
		
		Arrays.sort(A);
		
		for(int elem : A){
			if( elem == minValue) minValue++;
		}
		
		return minValue;
    }
}
