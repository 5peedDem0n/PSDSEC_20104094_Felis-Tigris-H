package id.felis.modul0;

import java.util.Scanner;

public class LoopWhile {
    /*
    PROGRAM PERKALIAN INCREMENT KESAMPING DAN DECREMENT KEBAWAH
    MEMBENTUK SEGITIGA SIKU - SIKU
     */
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int a, b;

        System.out.print("Masukkan bilangan positif : ");
        a = s.nextInt();

        while (a >= 1){
            b = 1;
            while (b <= a){
                System.out.println(b * a + "");
                b++;
            }
            System.out.println();
            a--;
        }
    }
}
