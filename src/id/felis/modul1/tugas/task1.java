package id.felis.modul1.tugas;

public class task1 {
    /*
    SEGITIGA SIKU -SIKU ANGKA
    1
    2 3
    4 5 6
    ...
     */
    public static void main(String[] args) {
        int angka = 1;
        for (int i = 0; i < 5; i++) {
            System.out.println();
            for (int j = 0; j < i; j++) {
                System.out.print(angka + " ");
                angka++;
            }
        }
    }
}
