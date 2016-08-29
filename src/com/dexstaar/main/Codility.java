package com.dexstaar.main;

import com.dexstaar.codility.*;

import java.util.Arrays;

public class Codility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CyclicRotation cyclicRotation = new CyclicRotation();

		int[] A = {3,8,9,7,6};
		int K = 2;
		
		System.out.println(Arrays.toString( cyclicRotation.solution(A, K) ) );
	}

}
