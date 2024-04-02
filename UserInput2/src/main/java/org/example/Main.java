package org.example;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        //User input

        System.out.println();

        Scanner scanner = new Scanner(System.in); //ususally at top

        System.out.println("what is you name");
        String name = scanner.nextLine();
        System.out.println("How old are you");
        int age = scanner.nextInt();
        scanner.nextLine(); //to clear previous scanner
        System.out.println("What is your favorite food");
        String food = scanner.nextLine();

        System.out.println("Hello "+name);
        System.out.println("You are "+age+" years old");
        System.out.println("You like "+food);

    }
}