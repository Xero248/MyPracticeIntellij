package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Math math = new Math();
        math.inputValues(); // Prompt user for input
        double result = math.computeR(); // Compute r
        System.out.println("Computed value of r: " + result);

        // or we can do it this way which is easier classes will also be done later the previous involves a class

//        double c;
//        double d;
//        double f;
//
//        System.out.println("Enter side c: ");
//        c = scanner.nextDouble();
//        System.out.println("Enter side d: ");
//        d = scanner.nextDouble();
//
//        f = java.lang.Math.sqrt((c*c)+(d*d));
//        System.out.println("The hypotenuse is: "+f);
    }
}