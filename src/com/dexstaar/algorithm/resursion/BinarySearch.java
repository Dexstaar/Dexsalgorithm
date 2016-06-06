package com.dexstaar.algorithm.resursion;

public class BinarySearch {
	public BinarySearch(){}
	
	public int binarySearch(int[] array, int target) throws BSException{
		return binarySearch(array, target, 0, array.length-1);
	}
	
	public int binarySearch(int[] array, int target, int lower, int upper) throws BSException {
		int center, range;
		
		range = upper - lower;
		
		System.out.println("upper = "+upper+" | lower = "+lower);
		
		if(range < 0){
			throw new BSException("Limits reversed");
		}else if(range == 0 && array[lower] != target){
			throw new BSException("Element not in array");
		}
		
		if(array[lower]>array[upper]){
			throw new BSException("Array not sorted");
		}
		
		center = ((range)/2) + lower;
		
		System.out.println("center = " + center);
		
		if(target == array[center]){
			return center;
		}else if(target < array[center]) {
			return binarySearch(array, target, lower, center-1);
		}else{
			return binarySearch(array, target, center+1, upper);
		}
	}
}
