package com.dexstaar.codility;

public class CyclicRotation {
	public CyclicRotation(){
		
	}
	
	public int[] solution (int[] A, int K){
		int N = A.length;
		
        if (N==0) return A;
        if (K==0) return A;
        
        if (K>=N) K %= N;
       
        int [] rotA = new  int [N];
        
        for (int i=0; i<N; i++)
        {
        	rotA[i] = (i<K) ? A[N+i-K] : A[i-K];
        }
            
        return rotA;
	}
}
