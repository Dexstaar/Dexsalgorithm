package com.dexstaar.codility;

public class MinPerimeterRectangle {
    public int solution(int N) {

        double roN = Math.sqrt(N);
        int min = 0;
        int perimeter = 0;

        for(int i=1; i<=roN; i++) {
            if(N % i == 0) {
                perimeter = 2 * ( i + (N/i) );
            }

            if(min == 0) {
                min = perimeter;
            } else {
                if( perimeter < min ) min = perimeter;
            }
        }

        return min;
    }
}
