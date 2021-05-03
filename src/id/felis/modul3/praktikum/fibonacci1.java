package id.felis.modul3.praktikum;

public class fibonacci1 {
    /*
    FIBONACCI ITERATIF
     */
    public static long fbnacci1(long number){
        if (number == 0)
            return 0;
        else if (number == 1)
            return 1;
        else {
            long x = 0;
            long y = 1;
            for (int i = 2; i <= number; i++) {
                y = x + y;
                x = y - x;
            }
            return y;
        }
    }

    public static void main(String[] args) {
        System.out.println("Fibonacci Iteratif : " + fbnacci1(10));
    }
}
