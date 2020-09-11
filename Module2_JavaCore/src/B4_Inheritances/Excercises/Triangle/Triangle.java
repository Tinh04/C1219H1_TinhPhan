package B4_Inheritances.Excercises.Triangle;

import B4_Inheritances.Practices.ShapeObject.ShapeObject;

import java.util.Scanner;

public class Triangle extends ShapeObject {
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    public Triangle() {
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getPerimeter() {
        return (side1 + side2 + side3);
    }

    public double getArea() {
        double p = (side1 + side2 + side3) / 2;
        return Math.sqrt(p * (p - side1) + p * (p - side2) + p * (p - side3));
    }

    @Override
    public String toString() {
        return "This Triangle with side1 = " + this.getSide1() + " , side2 = " + this.getSide2() +
                " , side3 = " + this.getSide3() + " has: \n Perimeter = " + this.getPerimeter() +
                "\n Area = " + this.getArea();
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the side1:");
        double side1 = scanner.nextDouble();
        System.out.println("Enter the side2:");
        double side2 = scanner.nextDouble();
        System.out.println("Enter the side3:");
        double side3 = scanner.nextDouble();

        triangle.setSide1(side1);
        triangle.setSide2(side2);
        triangle.setSide3(side3);

        System.out.println(triangle.toString());
    }
}
