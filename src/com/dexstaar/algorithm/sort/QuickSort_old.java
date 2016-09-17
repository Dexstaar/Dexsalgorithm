package com.dexstaar.algorithm.sort;

public class QuickSort_old {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 9, 4, 3, 7, 1, 6, 3, 7, 4, 8 };
		

		QuickSort_old quickSort = new QuickSort_old();
		quickSort.quickSortExec(arr, 0, arr.length-1);
		System.out.println( quickSort.convertArrtoStr(arr) );

	}
	
	private void quickSortExec( int arr[], int start, int end ){
		//1. i,j, pivot 셋팅
		int i = start;
		int j = end;
		int pivot = arr[ (start+end)/2 ];
		System.out.println( "pivot = "+pivot );
		
		//i,j 증감 수행 및 위치 교환
		//i는 pivot 이상값이 나올때까지 뒤로 
		//j는 pivot 이하값이 나올때까지 앞으로
		while( i <= j ){
			while( arr[i] < pivot ) i++;
			while( arr[j] > pivot ) j--;
			
			if( i <= j ){
				swap( arr, i, j );
				i++;
				j--;
			}
		}
		
		System.out.println( "start = "+start+" | end = "+end+" | i = "+i+" | j = "+j );
		//범위를 줄여가며 재귀호출 
		if( start < j ) quickSortExec( arr, start, j );
		if( i < end ) quickSortExec( arr, i, end );
	}
	
	private void swap( int arr[], int i, int j ){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	private String convertArrtoStr( int arr[] ){
		String returnStr = new String();
		String separator = ",";
		
		for( int i=0; i<arr.length; i++ ){
			if( i == arr.length-1 ) separator = "";
			returnStr += arr[i] + separator;
		}
		
		return returnStr;
	}

}
