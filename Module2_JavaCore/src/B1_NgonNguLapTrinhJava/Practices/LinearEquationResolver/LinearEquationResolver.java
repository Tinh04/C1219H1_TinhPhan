package B1_NgonNguLapTrinhJava.Practices.LinearEquationResolver;

import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver have the form: ax + b = 0");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a: ");
        double a = scanner.nextDouble();
        System.out.println("Enter b: ");
        double b = scanner.nextDouble();
        double result;
        if (a != 0) {
            result = -b / a;
            System.out.printf("The equation has solution is: x = %f\n", result);
        } else {
            if (b == 0) {
                System.out.println("The equation has countless solutions.");
            } else {
                System.out.println("The equation has no solution.");
            }
        }
    }
}
