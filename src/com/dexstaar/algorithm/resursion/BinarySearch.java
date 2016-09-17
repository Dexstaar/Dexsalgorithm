package com.dexstaar.algorithm.resursion;

/**
 * Find the index of integer X in array A
 *
 * condition) A is sorted as ascending
 */
public class BinarySearch {
    public int getIndex(int[] array, int target){
        return getIndex(array, target, 0, array.length-1);
    }

    private int getIndex(int[] array, int target, int lower, int upper){
        int center, range;
        range = upper - lower;
        center = range / 2 + lower;

        if(target == array[center]){
            return center;
        }else if(target < array[center]){
            return getIndex(array, target, lower, center - 1);
        }else{
            return getIndex(array, target, center + 1, upper);
        }
    }

}
