package id.felis.modul1.praktikum;

public class program3 {
    /*
    MEMBUAT SEGITIGA SIKU2 MENGGUNAKAN ANGKA
    NESTED FOR
     */
    public static void main(String[] args) {

        for (int a = 7; a >= 0; a--) {//ANGKA KEBAWAH
            System.out.println();
            for (int b = 7; b > a; b--) {//ANGKA KESAMPING
                System.out.print(b + " ");
            }
        }
    }
}
