package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        // array = used to store multiple values in a single variable

//        String[] cars ={"Camaro", "Corvette","Tesla","BMW"};
//
//        cars [0] = "Mustang";
//
//        System.out.println(cars[0]);

        String cars[] = new String[3];

        cars[0] = "Camaro";
        cars[1] = "Corvette";
        cars[2] = "Tesla";

        //System.out.println(cars[1]);

        for(int i = 0; i< cars.length; i++){
            System.out.println(cars[i]);
        }
    }
}