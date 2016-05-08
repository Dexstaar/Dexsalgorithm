package com.dexstaar.codility;

import java.util.Arrays;

public class PermMissingElem1 {
	public PermMissingElem1(){
		
	}
	
	public int solution(int[] A) {
        // write your code in Java SE 8
		int missingElem = 0;
		
		if(A.length==1){
			missingElem = A[0];
			return missingElem;
		}
		
		//정렬
		Arrays.sort(A);
		
		//for 문에서 +1 값이 존재하는지 체크 
		for(int i=0; i<A.length-1; i++){
			if(A[i]+1 != A[i+1]){
				missingElem = A[i]+1;
			}
		}
		
		return missingElem;
    }
}
