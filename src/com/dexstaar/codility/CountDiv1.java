package com.dexstaar.codility;

public class CountDiv1 {
	public CountDiv1(){
		
	}
	
	public int solution(int A, int B, int K) {
        // write your code in Java SE 8
		int a = B-A;
		int b = a/K;
		int c = b+1;
		
		return c;
    }
}
