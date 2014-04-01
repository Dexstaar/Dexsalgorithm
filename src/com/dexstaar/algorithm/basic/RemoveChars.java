package com.dexstaar.algorithm.basic;

public class RemoveChars {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sourceStr = "sekfh%fsefjh^efjlsi&efkje";
		String removeStr = "%^&";
		
		RemoveChars removeChars = new RemoveChars();
		System.out.println( removeChars.getRemovedStr(sourceStr, removeStr) );
	}
	
	private String getRemovedStr( String sourceStr, String removeStr ){
		//1. 넘어온 문자열을 배열화
		char sourceArr[] = sourceStr.toCharArray();
		char removeArr[] = removeStr.toCharArray();
		
		//2. boolean 배열에 삭제할 문자를 true 값으로 담음
		boolean[] removeFlags = new boolean[128];
		
		for( int i=0; i<removeArr.length; i++ ){
			removeFlags[ removeArr[i] ] = true;
		}
		
		//3. source를 순차적으로 검색하면서 boolean 배열중 true인 문자를 빼고 재정렬
		int k = 0;
		for( int i=0; i<sourceArr.length; i++ ){
			if( !removeFlags[ sourceArr[i] ] ){
				sourceArr[k] = sourceArr[i];
				k++;
			}
		}
		
		return new String ( sourceArr, 0, k );
		
	}

}
