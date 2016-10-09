package com.dexstaar.main;

import com.dexstaar.question.*;

import java.time.LocalDate;

/**
 * Created by dexstar on 9/20/16.
 */
public class Question {
    public static void main(String[] args) {


        //How many 8 from the array
        HowManyK howManyK = new HowManyK();

        int start = 1;
        int end = 10000;
        int k = 8;

        System.out.println(howManyK.getCount(start, end, k));


        /*
        // find kth smallest
        int[] arr = {9, 8, 7, 6, 5, 0, 1, 2, 3, 4};

        KthSmallest kthSmallest = new KthSmallest();

        System.out.println(kthSmallest.quickSelect(arr, 3));
        */


        /*
        // find kth lagest
        int[] arr =  {7,1,2,9,3,5,6,8,4};
        KthLargest kthLargest = new KthLargest();

        System.out.println( kthLargest.findKthLargest(arr, 3) );
        */


        /*
        // Date 관련 문제들
        LocalDate today = LocalDate.now();
        LocalDate christMas = LocalDate.of(2016, 10, 23);

        HoonCalendar hoonCalendar = new HoonCalendar();
        System.out.println(hoonCalendar.getDateCount(today, christMas));
        */






        /*
        // A,B,C 를 하나씩 담고있는 최단 거리를 구하라
        NextOne nextOne = new NextOne();

        int[] posA = {1, 18, 30, 44, 58};
        int[] posB = {2, 23, 50, 60};
        int[] posC = {3, 35, 42, 54, 63};

        nextOne.solution(posA, posB, posC);
        */

    }
}
