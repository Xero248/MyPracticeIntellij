package org.example;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//While loop = executes a block of code as it's condition remains true

        String Name="";
        while (Name.isBlank()) {
            System.out.println("Enter your name: ");

            Name = scanner.nextLine();
        }
        System.out.println("Hello "+Name);

        // a Do Loop

//        do {
//            System.out.println("Enter your name: ");
//
//            Name = scanner.nextLine();
//        }while (Name.isBlank());
//        System.out.println("Hello "+Name);
    }
}