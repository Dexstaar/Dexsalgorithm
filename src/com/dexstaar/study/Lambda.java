package com.dexstaar.study;

interface Calculator {
    int calculate(int first, int second);
}

class Operator {
    public void operate(Calculator calculator){
        int result = calculator.calculate(2,3);
        System.out.println(result);
    }
}


public class Lambda {
    public static void main(String[] args){
        Operator operator = new Operator();

        // traditional way
        operator.operate(new Calculator(){
            public int calculate(int first, int second){
                return first + second;
            }
        });

        // using Lambda
        operator.operate( (first, second) -> {
            return first * second;
        });
    }
}
