package com.dexstaar.algorithm.resursion;

public class BinarySearch {
    public int getIndex(int[] arr, int target){
        return getIndex(arr, target, 0, arr.length);
    }

    private int getIndex(int[] arr, int target, int startIndex, int endIndex){
        int range = endIndex - startIndex;
        int center = range/2 + startIndex;

        //System.out.println("startIndex = "+startIndex +" | endIndex = "+ endIndex +" | range = "+ range +" | center = "+ center);

        if(range == 0) return -1;

        if(arr[center] == target){
            return center;
        }else if(arr[center] > target){
            return getIndex(arr, target, startIndex, center-1);
        }else{
            return getIndex(arr, target, center+1, endIndex);
        }

    }
}
