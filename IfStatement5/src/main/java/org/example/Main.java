package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
// if statement = performs a block of code if it's condition is to be true
        int Age = 18;

        if (Age==75){
            System.out.println("ok Boomer");
        }
        else if (Age>=18) {
            System.out.println("You are an adult");
        }
        else if(Age>=13){
            System.out.println("You are a teenager");
        }
        else{
            System.out.println("You are not an adult");
        }

    }
}