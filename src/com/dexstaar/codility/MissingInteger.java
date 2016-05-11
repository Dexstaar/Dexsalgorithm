package com.dexstaar.codility;

import java.util.*;

public class MissingInteger {
	public MissingInteger(){
		
	}
	
	public int solution(int[] A) {
        // write your code in Java SE 8
		Set<Integer> set = new HashSet<Integer>();

        for(int x:A) {
            set.add(x);
        } 

        int maximum = Collections.max(set);

        while (maximum <= 0) {
            maximum ++;
        }

        int num = maximum + 1;

        for(int i=1; i<=maximum; i++) {
            num = i;
            if(set.contains(num)) {
                num++;
            }
            else {
                break;
            }
        }
        return num;
    }
}
