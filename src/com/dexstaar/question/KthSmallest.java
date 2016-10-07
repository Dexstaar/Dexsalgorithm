
package com.dexstaar.question;

import java.util.Arrays;

public class KthSmallest {

    public int quickSelect(int[] arr, int k){
        if(k < 1 || arr == null) return 0;

        return quickSelect(arr, k, 0 , arr.length-1);
    }

    public int quickSelect(int[] arr, int k, int start, int end) {

        int pivot = arr[end];

        int left = start;
        int right = end;

        while (true) {

            while (arr[left] < pivot && left < right) {
                left++;
            }

            while (arr[right] >= pivot && right > left) {
                right--;
            }

            if (left == right) {
                break;
            }

            swap(arr, left, right);
        }

        swap(arr, left, end);

        if (k == left + 1) {
            return pivot;
        } else if (k < left + 1) {
            return quickSelect(arr, k, start, left - 1);
        } else {
            return quickSelect(arr, k, left + 1, end);
        }
    }

    public void swap(int[] nums, int n1, int n2) {
        int tmp = nums[n1];
        nums[n1] = nums[n2];
        nums[n2] = tmp;
    }

}












