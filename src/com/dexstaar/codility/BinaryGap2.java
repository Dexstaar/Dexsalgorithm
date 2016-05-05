package com.dexstaar.codility;

public class BinaryGap2 {
	public BinaryGap2(){
		
	}
	
	public int solution(int N){
		String binaryStr = Integer.toBinaryString(N);
		//System.out.println(binaryStr);
		
		int counter = 0;
		int gap = 0;
		
		for(int i=0; i<binaryStr.length(); i++){
			
			if(binaryStr.charAt(i) == '1'){
				gap = Math.max(counter, gap);
				counter = 0;
			}else{
				counter++;
			}
			//System.out.println("counter = |"+counter+" gap = "+gap);
		}
		
		return gap;
	}
}
