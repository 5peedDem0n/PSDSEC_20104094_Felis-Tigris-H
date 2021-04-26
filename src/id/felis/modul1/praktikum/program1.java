package id.felis.modul1.praktikum;

import java.util.Scanner;

public class program1 {
    /*
    MENGIDENTIFIKASI RERATA NILAI MENGGUNAKAN HURUF
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Masukkan rerata nilai\t: ");
        double rerata = s.nextDouble();

        if (rerata >= 0 && rerata < 4) System.out.println("Dapat D");
        else if (rerata >= 4 && rerata < 6) System.out.println("Dapat C");
        else if (rerata >= 6 && rerata < 8) System.out.println("Dapat B");
        else if (rerata >= 8 && rerata < 10) System.out.println("Dapat A");

    }
}
