package com.dexstaar.algorithm.sort;

public class QuickSort {
    public int[] quickSort(int[] arr){
        quickSort(arr, 0, arr.length-1);

        return arr;
    }

    private void quickSort(int[] arr, int start, int end){
        // 1. i,j,pivot 셋팅
        int pivot = arr[(start+end)/2];
        int i = start;
        int j = end;

        // 2. i,j 증감 수행 및 위치 교환
        // i는 pivot 보다 큰 값이 나올때까지 뒤로
        // j는 pivot 보다 작은 값이 나올때까지 앞으로
        while(i <= j){
            //피벗보다 큰 값을 가지는 맨 왼쪽 원소의 좌표값을 찾아냄
            while(arr[i] < pivot) i++;

            //피벗보다 작은 값을 가지는 맨 오른쪽 원소의 좌표값을 찾아냄
            while(arr[j] > pivot) j--;

            //잘못된 위치에 있는 값을 서로 맞바꿈
            if(i <= j){
                swap(arr, i, j);
                i++;
                j--;
            }
        }

        //파티션이 남아있으면 그 부분에 대해 적용할 범위를 줄여가며 재귀 호출
        if(start < j){
            quickSort(arr, start, j);
        }
        if(i < end){
            quickSort(arr, i, end);
        }
    }

    private void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
