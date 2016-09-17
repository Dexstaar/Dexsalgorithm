package com.dexstaar.algorithm.sort;

public class QuickSort {

	//간단하지만 효율이 떨어지는 퀵소트
	public int[] quicksortSimple(int[] data){
		if( data.length < 2){
			return data;
		}

		int pivotIndex = data.length / 2;
		int pivotValue = data[pivotIndex];

		int leftCount = 0;

		//피벗보다 작은 원소 개수 세기
		for(int i=0; i<data.length; i++){
			if(data[i]<pivotValue) leftCount++;
		}

		//배열 할당 및 부분집합 만들기
		int[] left = new int[leftCount];
		int[] right = new int[data.length - leftCount - 1];
		int l = 0;
		int r = 0;

		for(int i=0; i<data.length;i++){
			if(i == pivotIndex) continue;

			int val = data[i];

			if(val < pivotValue){
				left[l++] = val;
			}else{
				right[r++] = val;
			}
		}

		//부분집합 정렬
		left = quicksortSimple(left);
		right = quicksortSimple(right);

		//정렬된 배열들과 피벗을 합쳐서 원래 배열로 만듦
		System.arraycopy(left, 0, data, 0, left.length);
		data[left.length] = pivotValue;
		System.arraycopy(right, 0, data, left.length+1, right.length);

		return data;
	}

}
