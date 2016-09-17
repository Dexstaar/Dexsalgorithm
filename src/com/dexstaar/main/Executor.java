package com.dexstaar.main;

import com.dexstaar.algorithm.Array.*;
import com.dexstaar.algorithm.resursion.*;
import com.dexstaar.algorithm.sort.*;

import java.util.Arrays;

public class Executor {

	public static void main(String[] args) {

		int[] arr = {2,8,3,4,5,6,1,7};

		QuickSort quickSort = new QuickSort();

		System.out.println( Arrays.toString(quickSort.quicksortSimple(arr)) );
	}

}
