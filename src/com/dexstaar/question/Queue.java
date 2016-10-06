package com.dexstaar.question;

import java.util.Stack;

public class Queue<E> {
    Stack<E> inbox = new Stack<>();
    Stack<E> outbox = new Stack<>();

    public void push(E item){
        inbox.push(item);
    }

    public E pop(){
        if(outbox.isEmpty()){
            while(!inbox.isEmpty()){
                outbox.push( inbox.pop() );
            }

        }
        return outbox.pop();
    }

}
