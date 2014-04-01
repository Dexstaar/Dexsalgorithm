package com.dexstaar.algorithm.basic;

import java.util.HashMap;

public class FirstNonRepeated {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aeaabaabbckkek";
		
		FirstNonRepeated firstNonRepeated = new FirstNonRepeated();
		System.out.println( firstNonRepeated.getFirstNonRepeated(str) );
	}
	
	private Character getFirstNonRepeated( String str ){
		//1. str을 char 배열화
		char charArr[] = str.toCharArray();
		
		//2. HashMap에 각 캐릭터별 반복 횟수를 담음.
		HashMap<Character, Integer> charHash = new HashMap<Character, Integer>();
		
		int i = 0;
		
		for( i=0; i<charArr.length; i++ ){
			if( charHash.containsKey( charArr[i] ) ){
				//HashMap 안에 char가 있으면 value를 증가
				charHash.put( charArr[i], charHash.get(charArr[i])+1 );
				
			}else{
				//없으면 value에 1 넣음
				charHash.put( charArr[i], 1 );
			}
		}
		
		//3. char 배열을 순차적으로 검색하면서 HashMap의 value 중 가장 먼저 1이 나오는 char를 리턴
		for( i=0; i<charArr.length; i++ ){
			if( charHash.get( charArr[i] ) == 1 ) return charArr[i];
		}
		
		return null;
	}

}
