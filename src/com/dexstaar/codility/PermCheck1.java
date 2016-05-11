package com.dexstaar.codility;

public class PermCheck1 {
	public PermCheck1(){
		
	}
	
	public int solution(int[] A) {
        // write your code in Java SE 8
		int result = 0;
		
		// Getting sum
		//((N+1)*N) / 2
		int length = A.length;
		int sum = ((length+1)*length) / 2;
		
		// loop: subtract each element's value from sum
		// if it's 0, it's permutation
		for(int elem : A){
			sum -= elem;
		}
		
		if(sum == 0) result = 1;
		
		return result;
    }
}
