package B1_NgonNguLapTrinhJava.Practices.CalculateTheBMI;

import java.util.Scanner;

public class CalculateTheBMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight, height, bmi;

        System.out.println("Enter the weight (kg): ");
        weight = scanner.nextDouble();

        System.out.println("Enter th height (m):");
        height = scanner.nextDouble();

        bmi = weight / Math.pow(height, 2);

        System.out.printf("\"%-20s%s", "bmi", "Interpretation\n");

        if (bmi < 18)
            System.out.printf("%-20.2f%s", bmi, "Underweight");
        else if (bmi < 25.0)
            System.out.printf("%-20.2f%s", bmi, "Normal");
        else if (bmi < 30.0)
            System.out.printf("%-20.2f%s", bmi, "Overweight");
        else
            System.out.printf("%-20.2f%s", bmi, "Obese");
    }
}
