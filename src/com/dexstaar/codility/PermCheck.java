package com.dexstaar.codility;

import java.util.Arrays;

public class PermCheck {
	public PermCheck(){
		
	}
	
	public int solution(int[] A) {
        // write your code in Java SE 8
		int result = 1;
		
		//asceding
		Arrays.sort(A);
		
		//loop: compare A[i] and i+1
		for(int i=0; i<A.length; i++){
			if( A[i] != (int) i+1 ){
				result = 0;
				break;
			}
		}
		
		return result;
    }
}
