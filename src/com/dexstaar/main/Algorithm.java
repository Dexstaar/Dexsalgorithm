package com.dexstaar.main;

import com.dexstaar.algorithm.resursion.*;
import com.dexstaar.algorithm.sort.*;

import java.util.Arrays;

public class Algorithm {

	public static void main(String[] args) {

		//Execute Permutations
		String input = "hat";

		Permutations permutations = new Permutations(input);
		permutations.permute();

		/*

		//Excute QuickSort
		int[] arr = {2,8,3,4,5,6,1,7};

		QuickSortOptimized quickSort = new QuickSortOptimized();

		System.out.println( Arrays.toString(quickSort.quickSortOptimized(arr)) );
		*/
	}

}
