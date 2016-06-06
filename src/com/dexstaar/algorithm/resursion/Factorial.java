package com.dexstaar.algorithm.resursion;

public class Factorial {
	public Factorial(){}
	
	public int getFactorial(int n){
		if(n>1) {
			return getFactorial(n-1)*n;
		}else{
			return 1;
		}
	}
}
