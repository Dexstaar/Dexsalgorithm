package com.dexstaar.codility;

public class PassingCars1 {
	public PassingCars1(){
		
	}
	
	public int solution(int[] A) {
        // write your code in Java SE 8
		int counter = 0;
		int carNum = 0;
		
		for(int i=0; i<A.length; i++){
			if(A[i] == 0){
				carNum++;
			}else{
				counter = counter + 1 * carNum;
			}
			
			//System.out.println("i = "+i+ " | carNum = "+carNum+"| counter = "+counter);
		}
		
		if( counter > 1000000000 ) counter = -1;
		
		return counter;
    }
}
