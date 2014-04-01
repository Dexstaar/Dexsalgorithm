package com.dexstaar.algorithm.sort;

public class MergeSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 5, 8, 4, 7, 1, 3, 2, 6 };
		
		MergeSort mergeSort = new MergeSort();
		mergeSort.mergeSortExec(arr, 0, arr.length-1);
		
		System.out.println( "정렬된 배열: " + mergeSort.convertArrayToString(arr) );
		//System.out.println( "정렬된 배열: " + new String( arr, 0, 7 ) );


	}
	
	private void mergeSortExec( int arr[], int start, int end ){
		int mid = 0;
		
		if( start < end ){
			mid = (start+end)/2;
			//System.out.println(mid);
			
			this.mergeSortExec(arr, start, mid);
			this.mergeSortExec(arr, mid+1, end);
			this.merge(arr, start, mid, end);
		}
	}
	
	private void merge( int arr[], int start, int mid, int end ){
		//좌측 
		int n1 = mid - start + 1;
		//우측 
		int n2 = end - mid;
		
		mid++;
		
		
		//좌, 우측 배열 선언 
		int leftArr[] = new int[n1+1];
		int rightArr[] = new int[n2+1];
		
		int i = 0;
		int j = 0;
		
		//좌우 배열에 값을 담는다.
		for( i=0; i<leftArr.length-1; i++ ){
			leftArr[i] = arr[start+i];
		}
		for( j=0; j<rightArr.length-1; j++ ){
			rightArr[j] = arr[mid+j];
		}
		
		//좌우 배열 마지막 값에 큰수를 담는다.
		leftArr[n1] = Integer.MAX_VALUE;
		rightArr[n2] = Integer.MAX_VALUE;
		
		i = 0;
		j = 0;
		
		
		//arr[k]에 좌우를 비교하여 작은 수 부터 차례로 담는다.
		for( int k=start; k<=end; k++ ){
			if( leftArr[i] <= rightArr[j] ){
				arr[k] = leftArr[i];
				i++;
			}else{
				arr[k] = rightArr[j];
				j++;
			}
		}
				
	}
	
	private String convertArrayToString( int arr[] ){
		String returnStr = new String();
		String separator = ",";
		
		for( int i=0; i<arr.length; i++ ){
			if( i == arr.length-1 ) separator = "";
			returnStr += arr[i] + separator;
		}
		
		return returnStr;
	}
	

}
