package org.example;
import java.util.*;
public class Math {

    Scanner scanner = new Scanner(System.in);

    double e;
    double z;
    double r;

    public void inputValues() {
        System.out.print("Enter the value of e: ");
        e = scanner.nextDouble();
        System.out.print("Enter the value of z: ");
        z = scanner.nextDouble();
    }
    public double computeR() {
        r = java.lang.Math.sqrt(e * e + z * z);
        return r;
    }




}
