package com.dexstaar.codility;

public class BinaryGap {
	public BinaryGap(){
		
	}
	
	public int solution(int N) {
        // write your code in Java SE 8
		String binaryStr = Integer.toBinaryString(N);
		//System.out.println(binaryStr);
		
		int gap = 0;
		int counter = 0;
		
		
		for(int i=0; i<binaryStr.length(); i++){
			if(binaryStr.charAt(i)=='1'){
				gap = Math.max(gap, counter);
				counter = 0;
			}else{
				counter++;
			}
			//System.out.println("Gap = "+gap+"| Counter = "+counter);
		}
		
		return gap;
    }
}
