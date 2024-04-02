package org.example;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
// nested loops = a loop inside a loop
        Scanner scanner = new Scanner(System.in);
        int rows;
        int colums;
        String symbol = "";

        System.out.println("Enter # of rows: ");
        rows = scanner.nextInt();
        System.out.println("Enter # of colums: ");
        colums = scanner.nextInt();
        System.out.println("Enter Symbole to use");
        symbol = scanner.next();

        for (int i = 1; i <= rows; i++) {
            System.out.println();
            for (int j = 1; j <= colums; j++) {
                System.out.print(symbol);

            }
        }
    }
}