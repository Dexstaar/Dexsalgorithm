package com.dexstaar.algorithm.basic;

public class BinarySearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 10, 20, 30, 40, 50, 60, 70 };
		
		BinarySearch binarySearch = new BinarySearch();
		System.out.println( binarySearch.getLocation(arr, 60) );

	}
	
	private int getLocation( int arr[], int target ){
		//center, range값을 구함
		int start = 0;
		int end = arr.length-1;
		int range = end - start;
		int center = (range/2) + start;
		
		//반복문을 통해 범위를 줄여가며 center와 target이 만나면 return 
		while( true ){
			range = end - start;
			center = (range/2) + start;
			
			if( arr[center] == target ){
				return center;
			}else if( arr[center] > target ){
				end = center - 1;
			}else if( arr[center] < target ){
				start = center + 1;
			}
		}
	
	}

}
