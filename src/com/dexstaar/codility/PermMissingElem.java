package com.dexstaar.codility;

public class PermMissingElem {
	public PermMissingElem(){
		
	}
	
	public int solution(int[] A){
		long N = A.length + 1;
		
		//((N + 1) x N) / 2
		long total = ((N + 1) * N) / 2;
		
		for(int elem : A) total -= elem;
		
		return (int) total;
	}
}
