package com.dexstaar.codility;

public class FrogJmp {
	public FrogJmp(){
		
	}
	
	public int solution(int X, int Y, int D) {
        // write your code in Java SE 8
		int jump = 0;
		int distance = Y - X;
		
		jump = ( distance % D == 0) ? distance/D : distance/D+1;
		
		return jump;
    }
}
