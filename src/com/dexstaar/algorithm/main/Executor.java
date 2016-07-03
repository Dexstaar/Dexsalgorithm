package com.dexstaar.algorithm.main;

import com.dexstaar.algorithm.resursion.*;

public class Executor {

	public static void main(String[] args) {
		BinarySearch binarySearch = new BinarySearch();
		
		int[] arr = {1,2,3,4,5,6};
		
		try{
			System.out.println( binarySearch.binarySearch(arr, 4) );
		}catch(BSException bse){
			System.out.println(bse);
		}
		

	}

}
