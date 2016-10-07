package com.dexstaar.main;

import com.dexstaar.algorithm.resursion.*;
import com.dexstaar.algorithm.sort.*;

import java.util.Arrays;

public class Algorithm {

	public static void main(String[] args) {


		/*
		//Binary Search
		BinarySearch binarySearch = new BinarySearch();
		int[] arr = {1,2,3,4,5,6,7,8,9};
		System.out.println( binarySearch.getIndex(arr, 10) );
		*/



		/*
		//Execute Combinations
		String input = "wxyz";
		Combinations combinations = new Combinations(input);
		combinations.combine();
		*/






		/*
		//Execute Permutations
		String input = "stop";

		Permutations permutations = new Permutations(input);
		permutations.permute();
		*/




		//Excute QuickSort
		int[] arr = {2,8,3,4,5,6,1,7};

		QuickSort quickSort = new QuickSort();

		System.out.println( Arrays.toString(quickSort.quickSort(arr)) );

	}

}
