package com.dexstaar.algorithm.sort;

/**
 * Created by dexstar on 9/18/16.
 */
public class QuickSortOptimized {
    public int[] quickSortOptimized(int[] data){
        quickSortOptimized(data, 0, data.length-1);

        return data;
    }

    private void quickSortOptimized(int[] data, int left, int right){
        //1. i,j, pivot 셋팅
        int pivotValue = data[(left+right)/2];
        int i = left;
        int j = right;

        //i,j 증감 수행 및 위치 교환
        //i는 pivot 이상값이 나올때까지 뒤로
        //j는 pivot 이하값이 나올때까지 앞으로
        while (i<=j){
            //피벗 이상 값을 가지는 맨 왼쪽 원소를 찾아냄
            while(data[i] < pivotValue) i++;

            //피벗 이하 값을 가지는 맨 오른쪽 원소를 찾아냄
            while(data[j] > pivotValue) j--;

            //잘못된 위치에 있는 값을 서로 맞바꿈
            if(i <= j){
                swap(data, i, j);
                i++;
                j--;
            }
        }

        //파티션이 남아있으면 알고리즘을 그 부분에 대해 적용함
        //범위를 줄여가며 재귀호출

        if(left < j){
            quickSortOptimized(data, left, j);
        }
        if(i < right){
            quickSortOptimized(data, i, right);
        }
    }

    private void swap( int arr[], int i, int j ){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
