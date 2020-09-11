package B1_NgonNguLapTrinhJava.Excercise.DisplayTheGreating;

import java.util.Scanner;

public class DisplayTheGreeting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello: " + name);
    }
}
