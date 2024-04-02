package org.example;

public class StackLinked {

    class Node{
        int data;
        Node next;
    }

    Node top;

    public StackLinked(){
        top = null;
    }

    public boolean isFull(){
        Node temp;
        boolean returnVaule;

        try{
            temp = new Node();
            temp = null;
            returnVaule = false;
        } catch (OutOfMemoryError exp){
            returnVaule = true;
        }
        return returnVaule;
    }

    public void push(int item) throws Exception{
        if(isFull()){
            throw new Exception("Stack is full");
        }
        Node temp;
        temp = new Node();
        temp.data = item;
        temp.next = top;

        top = temp;
    }
    public int pop(){
        int returnItem;
        returnItem = top.data;
        // Move top to the next item in the stack
        top = top.next;

        return returnItem;
    }
    public boolean isEmpty(){
        return (top == null);
    }
    public void show(){
        Node curr;

        curr = top;

        while(curr != null){
            System.out.println(curr.data);

            curr = curr.next;
        }
    }
    public void makeEmpty(){
        top = null;
    }

}
