package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Swap two variables

        String x ="water";
        String y = "Kool-Aide";
        String temp;

        temp=x;
        x=y;
        y=temp;

        System.out.println("x: "+x);
        System.out.println("y: "+y );


    }
}