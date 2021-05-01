package id.felis.modul1.praktikum;

import java.util.Scanner;

public class program4 {
    /*
    MENGHITUNG LUAS LINGKARAN
     */
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        double phi = 3.14;

        System.out.print("Masukkan jari - jari\t: ");
        int r = s.nextInt();
        double luas = phi * r * r;
        System.out.println("Luas Lingkaran = " + luas);
    }
}
