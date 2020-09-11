package B1_NgonNguLapTrinhJava.Practices.UsingTheOperator;

import java.util.Scanner;

public class UsingTheOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the width: ");
        float width = scanner.nextFloat();

        System.out.println("Enter the height: " );
        float height = scanner.nextFloat();

        float area = width * height;
        System.out.println("Area is: " + area);

    }
}
