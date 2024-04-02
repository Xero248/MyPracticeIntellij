package org.example;
import java.util.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer: ");

        Scanner scanner = new Scanner(System.in);
        int input1 = scanner.nextInt();

        System.out.println("Enter another integer: ");
        int input2 = scanner.nextInt();

        int total = input1 + input2;

        while (input2 > 0){
            System.out.println(total + "\nEnter another interger:  ");
            total += scanner.nextInt();
        }
    }
}
