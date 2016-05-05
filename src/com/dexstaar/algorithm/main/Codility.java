package com.dexstaar.algorithm.main;
import java.util.Arrays;

import com.dexstaar.codility.*;

public class Codility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {3,8,9,7,6};
		CycleRotation cycleRatation = new CycleRotation();
		
		int[] returnArr = cycleRatation.solution( A, 6 );
		System.out.println(Arrays.toString(returnArr));
	}

}
