/*package com.dexstaar.algorithm.LinkedList;

public class Link {

    public String bookName;
    public int millionsSold;

    public Link next;

    public Link(String bookName, int millionsSold){
        this.bookName = bookName;
        this.millionsSold = millionSold;
    }

    public void display(){
        System.out.println(bookName + ": " + millionSold + ",000,000");
    }

    public String toSting(){
        return bookName;
    }

    public static void main(String[] args){

    }
}

class LinkList{

    public Link firstLink;

    LinkList(){
        firstLink = null;
    }

    public boolean isEmpty(){
        return(firstLink == null);
    }

    public void insertFirstLink(String bookName, int millionsSold){
        Link newLink = new Link(bookName, millionsSold);

        newLink.next = firstLink;

        firstLink = newLink;
    }

    public Link removeFirst(){
        Link linkReference = firstLink;

        if(!isEmpty()){
            firstLink = firstLink.next;
        }else{
            System.out.println("Empty LinkedList");
        }

        return linkReference;
    }
}
*/