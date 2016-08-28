package com.dexstaar.main;

import com.dexstaar.algorithm.resursion.*;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearch binarySearch = new BinarySearch();
		
		int[] arr = {0,1,2,3,4,5,6};
		
		try{
			System.out.println( binarySearch.binarySearch(arr, 2) );
		}catch(BSException bsE){
			System.out.println(bsE);
		}
		
		
	}

}
