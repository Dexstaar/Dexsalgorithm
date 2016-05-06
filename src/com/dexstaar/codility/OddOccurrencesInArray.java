package com.dexstaar.codility;

public class OddOccurrencesInArray {
	public OddOccurrencesInArray(){
		
	}
	
	public int solution(int[] A){
		int returnNum = 0;
		
		for(int arrNum : A){
			//System.out.println("returnNum = "+returnNum+" | arrNum = "+ arrNum);
			
			//returnNum ^= i;
			returnNum = returnNum ^ arrNum;
		}
		
		return returnNum;
	}
}
