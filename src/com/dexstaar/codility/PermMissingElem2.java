package com.dexstaar.codility;

import java.util.Arrays;

public class PermMissingElem2 {
	public PermMissingElem2(){
		
	}
	
	public int solution(int[] A) {
        // write your code in Java SE 8
		
		//정렬 
		Arrays.sort(A);
		
		// 주어진 배열의 합
		int sum = 0;
		for(int elem : A) sum += elem;
		
		// 원래의 합 
		int lastElem = A[A.length-1];
		int idealSum = ((lastElem+1)*lastElem) / 2;
		
		return idealSum - sum;
		
		
    }
}
