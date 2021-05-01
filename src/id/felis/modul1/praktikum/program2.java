package id.felis.modul1.praktikum;

public class program2 {
    /*
    MEMBUAT SEGITIGA SAMA KAKI MENGGUNAKAN NESTED FOR
     */
    public static void main(String[] args) {
        //NESTED FOR
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k < (2 * i); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
