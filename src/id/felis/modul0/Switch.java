package id.felis.modul0;

import java.util.Scanner;

public class Switch {
    /*
    PROGRAM UNTUK MELIHAT PROFIL CHAR
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int no;

        do {
        System.out.println("\nWAIFU PROFILE");
        System.out.println("1. Layla");
        System.out.println("2. Irithel");
        System.out.println("3. Pharsa");
        System.out.println("0. Exit");


            System.out.println("more detail");
            System.out.print("Choose a number : ");
            no = s.nextInt();

        switch (no){
            case 1 :
                System.out.println("Layla" +
                        "\nChildish but funny");
                break;
            case 2 :
                System.out.println("Irithel" +
                        "\nWild but care to animal");
                break;
            case 3 :
                System.out.println("Pharsa" +
                        "\nCaring and mature, but clumsy");
                break;
            case 0 :
                System.out.print("Thank you :)");
                break;
            default :
                System.out.println("Data is not found!");
                break;
            }
        }while (no != 0);
    }
}
