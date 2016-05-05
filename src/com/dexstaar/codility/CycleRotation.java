package com.dexstaar.codility;

public class CycleRotation {
	public CycleRotation(){
	
	}
	
	public int[] solution(int[] A, int K) {
        // write your code in Java SE 8
		int ALength = A.length;
		int[] returnArr = new int[ALength];
		
		if(ALength == 0) return returnArr;
		
		
		
		int rotation = K % ALength;
		//System.out.println("rotation = "+rotation);
		
		int divideLocation = ALength-rotation;
		
		//System.out.println("divideLocation = "+divideLocation);
		
		int returnLocation = 0;
		
		//Rotation 앞부분 채움 
		for(int i=divideLocation; i<ALength; i++){
			returnLocation = i-divideLocation;
			returnArr[returnLocation] = A[i];
			
			//System.out.println("returnArr["+returnLocation+"] = "+returnArr[returnLocation]+" | A["+i+"] = "+A[i]);
		}
		
		
		//System.out.println("second roop");
		
		//Rotation 뒷부분 채움 
		for(int i=0; i<divideLocation; i++){
			returnLocation++;
			returnArr[returnLocation] = A[i];
			
			//System.out.println("returnArr["+returnLocation+"] = "+returnArr[returnLocation]+" | A["+i+"] = "+A[i]);
		}
		
		return returnArr;
		
		
		
		
    }
}
