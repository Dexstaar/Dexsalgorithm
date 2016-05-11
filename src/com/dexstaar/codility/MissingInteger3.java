package com.dexstaar.codility;

import java.util.ArrayList;

public class MissingInteger3 {
	public MissingInteger3(){
		
	}
	
	public int solution(int[] A) {
        // write your code in Java SE 8
		int result = 0;
		
		ArrayList<Integer> arrList = new ArrayList<Integer> ();
		
		for(int i=0; i<A.length; i++){
			if( !arrList.contains(A[i]) ){
				arrList.add(A[i]);
			}
		}
		
		for(int i=0; i<arrList.size(); i++){
			//System.out.println( i +" | "+ arrList.get(i) );
			//System.out.println( i+1 +" | "+ arrList.contains(i+1) );
			if( !arrList.contains(i+1) ) {
				result = i+1;
				break;
			}
		}
		
		if(result == 0) result = arrList.size() + 1;
		
		return result;
    }
}
