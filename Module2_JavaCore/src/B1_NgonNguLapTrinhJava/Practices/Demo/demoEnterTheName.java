package B1_NgonNguLapTrinhJava.Practices.Demo;

import java.util.Scanner;

public class demoEnterTheName {
    //ham chinh khoi chay dau tien
    public static void main(String[] args) {
        System.out.println("Nhap ten:");
        //Khoi tao ham nhap
        Scanner scanner = new Scanner(System.in);
        //khai bao bien moi de nhap du lieu
        String name = scanner.nextLine();
        //sout + enter
        System.out.println(name);
    }
}