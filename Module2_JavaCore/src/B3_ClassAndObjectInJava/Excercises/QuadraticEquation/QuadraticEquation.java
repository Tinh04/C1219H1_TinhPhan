package B3_ClassAndObjectInJava.Excercises.QuadraticEquation;

import java.util.Scanner;

public class QuadraticEquation {
     private double a, b, c;

    public QuadraticEquation() {
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminant() {
        return Math.pow(b, 2) - (4 * a * c);
    }

    public double getSolution1() {
        return (-b + Math.pow(getDiscriminant(),0.5)) / (2 * a);
    }

    public double getSolution2() {
        return (-b - Math.pow(getDiscriminant(),0.5)) / (2 * a);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a: ");
        double a = scanner.nextDouble();
        System.out.println("Enter b: ");
        double b = scanner.nextDouble();
        System.out.println("Enter c: ");
        double c = scanner.nextDouble();
        QuadraticEquation equation = new QuadraticEquation(a, b, c);
        if (equation.getDiscriminant() > 0) {
            System.out.println("The equation has two distinct solutions: " + equation.getSolution1() + " and" + equation.getSolution2());
        } else if (equation.getDiscriminant() == 0) {
            System.out.println("The equation has two double solutions: " + equation.getSolution1());
        } else {
            System.out.println("The equation has no solutions.");
        }
    }

}
