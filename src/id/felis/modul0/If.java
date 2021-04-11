package id.felis.modul0;

import java.util.Scanner;

public class If {
    /*
    PROGRAM UNTUK MENUTUP SUATU PROGRAM
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char yes = 'y', no = 'n';

        System.out.println("(yes = y, no = n)");
        System.out.print("Do you want to quit? ");
        char pilih = s.next().toLowerCase().charAt(0);

        if (pilih == 'y'){
            System.out.println("closed!");
        }else
            System.out.println("still running...");
    }
}
