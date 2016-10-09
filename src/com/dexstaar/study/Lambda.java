package com.dexstaar.study;

interface Say {
    String message(String name, String script);
}

class Person {
    public void greeting(Say say){
        String message = say.message("Hoon", " is using");
        System.out.println(message);
    }
}


public class Lambda {
    public static void main(String[] args){
        Person hoon = new Person();

        hoon.greeting(new Say(){
            public String message(String name, String script){
                StringBuilder sb = new StringBuilder();
                sb.append(name);
                sb.append(script);
                sb.append(" old way");
                return sb.toString();
            }
        });

        hoon.greeting( (name, script) -> {
            StringBuilder sb = new StringBuilder();
            sb.append(name);
            sb.append(script);
            sb.append(" Lambda !!");
            return sb.toString();
        });
    }
}
