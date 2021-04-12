package id.felis.modul0;

import java.util.Scanner;

public class LoopFor {
    /*
    PROGRAM UNTUK MENENTUKAN BILANGAN BERPANGKAT
     */
    public static void main(String[] args) {

        Scanner s = new Scanner (System.in);
        int hasil = 1;

        System.out.print("Masukkan bilangan\t\t: ");
        int bil = s.nextInt();
        System.out.print("Masukkan pencacahan\t\t: ");
        int pangkat = s.nextInt();

        for (int i = 0; i < pangkat; i++) {
            hasil *= bil;
        }
        System.out.print("Hasil pangkat\t\t\t: " + hasil);
    }
}
