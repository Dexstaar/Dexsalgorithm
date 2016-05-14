package com.dexstaar.codility;

public class PassingCars {
	public PassingCars(){
		
	}
	
	public int solution(int[] A) {
        // write your code in Java SE 8
		long counter = 0;
		int carNum = 0;
		
		for(int i=0; i<A.length; i++){
			if(A[i] == 0){
				carNum++;
			}else if(A[i] == 1){
				counter = counter + 1 * carNum;
			}
			
			//System.out.println("i = "+i+ " | carNum = "+carNum+"| counter = "+counter);
		}
		
		if( counter > 1000000000 ) counter = -1;
		
		return (int) counter;
    }
}
