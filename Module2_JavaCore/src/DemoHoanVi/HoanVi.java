package DemoHoanVi;

import java.util.Scanner;

public class HoanVi {
    public void Swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        HoanVi sw = new HoanVi();
        Scanner scanner = new Scanner(System.in);
        int arr[] = new int[2];

        System.out.println("Nhap a = ");
        arr[0] = scanner.nextInt();
        System.out.println("Nhap b =");
        arr[1] = scanner.nextInt();

        System.out.println("Before swap: a = " + arr[0]);
        sw.Swap(arr, 0, 1);
        System.out.println("After swap: a = " + arr[0]);

        scanner.close();
    }
}
