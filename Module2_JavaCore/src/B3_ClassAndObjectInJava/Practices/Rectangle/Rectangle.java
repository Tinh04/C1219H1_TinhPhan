package B3_ClassAndObjectInJava.Practices.Rectangle;

import java.util.Scanner;

//Tao lop Class
public class Rectangle {
    //khai bao properties (bien)
    double width, height;

    //khai bao phuong thuc khoi tao (contructor)
    public Rectangle() {
    }

    //Khai bao ham
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    //Dinh nghia phuong thuc tinh dien tich, chu vi, hien thi
    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return (this.height + this.width) * 2;
    }

    public String display() {
        return "Rectangle {width = " + width + ", height = " + height + "}";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the width:");
        double width = scanner.nextDouble();
        System.out.println("Enter the height:");
        double height = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(width, height);
        System.out.println(rectangle.display());
        System.out.println("Perimeter: " + rectangle.getArea());
        System.out.println("Area: " + rectangle.getPerimeter());
    }
}
