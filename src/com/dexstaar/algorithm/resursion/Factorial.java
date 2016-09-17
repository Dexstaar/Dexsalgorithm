package com.dexstaar.algorithm.resursion;

/**
 * Created by dexstar on 9/17/16.
 */
public class Factorial {

    public int getFactorial(int num){

        if(num > 1){
            return  num * getFactorial(num-1);
        }else{
            return 1;
        }
    }
}
