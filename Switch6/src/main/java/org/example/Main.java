package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // switch = statement that allows a variable to be tested for equality against a list of values

        String day = "Pizza";

        switch(day){
            case "Sunday": System.out.println("It is sunday");
                break;
            case "Monday": System.out.println("It is monday");
                break;
            case "Tuesday": System.out.println("It is Tuesday");
                break;
            case "Wednesday": System.out.println("It is Wednesday");
                break;
            case "Thursday": System.out.println("It is Thursday");
                break;
            case "Friday": System.out.println("It is Friday");
                break;
            case "Saturday": System.out.println("It is Saturday");
                break;
            default: System.out.println("That is not a day");
        }
    }
}