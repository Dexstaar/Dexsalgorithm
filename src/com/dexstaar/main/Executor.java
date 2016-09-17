package com.dexstaar.main;

import com.dexstaar.algorithm.Array.*;
import com.dexstaar.algorithm.resursion.*;

public class Executor {

	public static void main(String[] args) {

		int[] arr = {1,2,3,4,5,6,7,8};

		BinarySearch binarySearch = new BinarySearch();

		System.out.println( binarySearch.getIndex(arr, 7) );
	}

}
