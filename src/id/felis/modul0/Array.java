package id.felis.modul0;

import java.util.Scanner;

public class Array {
    /*
    PROGRAM UNTUK MEMBUAT MATRIKS
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Masukkan Baris Matriks\t: ");
        int baris = s.nextInt();
        System.out.print("Masukkan Kolom Matriks\t: ");
        int kolom = s.nextInt();

        int[][] matriks = new int[baris][kolom];

        System.out.println("\nMatriks");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("Masukkan baris ke-" + i  + " kolom ke-" + j + "\t: ");
                matriks[i][j] = s.nextInt();
            }


        }
        System.out.println();

        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("| " + matriks[i][j] + " |" + "\t");
            }
            System.out.println();
        }
    }
}
