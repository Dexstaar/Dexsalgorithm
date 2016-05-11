package com.dexstaar.codility;

import java.util.ArrayList;
import java.util.Arrays;

public class MissingInteger2 {
	public MissingInteger2(){
		
	}
	
	public int solution(int[] A) {
        // write your code in Java SE 8
		int result = 0;
		
		//sorting
		Arrays.sort(A);
		
		//make sequencial array
		ArrayList<Integer> arrList = new ArrayList<Integer> ();
		for(int elem : A) if( !arrList.contains(elem) ) arrList.add(elem);
		
		//finding missing one 
		for(int i=0; i<arrList.size(); i++){
			if( arrList.get(i) != i+1 ){
				result = i+1;
				break;
			}
			
			if(result == 0) result = i+1;
		}
		
		return result;
    }
}
