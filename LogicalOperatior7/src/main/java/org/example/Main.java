package org.example;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // logical operators = used to connect two or more expressions
        //
        //                      && = (AND) both conditions must be true
        //                      || = (OR) either condition must be true
        //                      ! = (NOT) reverse boolean value condition


        int Temp = 25;

        if(Temp>30){
            System.out.println("It is hot outside");
        }
        else if (Temp>=20 && Temp<=30) {
            System.out.println("It is warm outside");
        }
        else{
            System.out.println("it is cold outside");
        }

        System.out.println("You are playing a game! Press q or Q to quit");
        String response = scanner.next();

        if(response.equals("q") || response.equals("Q")){
            System.out.println("You quit the game");
        }
        else{
            System.out.println("You are still playing the game 'pew pew'");
        }
    }
}