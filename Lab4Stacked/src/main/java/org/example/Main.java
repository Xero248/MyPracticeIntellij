package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        StackLinked stack = new StackLinked();

        stack.show();

        try{
            System.out.println("Push data on stack");
            stack.push(10);
            stack.push(20);
            stack.push(30);

            stack.show();
            System.out.println();

            System.out.println("Pop one item");
            stack.pop();

            System.out.println("Call makeEmpty");
            stack.makeEmpty();

        }
        catch (Exception e){

        }

    }
}