package id.felis.modul3.praktikum;

public class fibonacci2 {
    /*
    FIBONACCI REKURSIVE
     */
    public static long fbncci2(int n){
        if (n <= 1)
            return n;
        else return fbncci2(n - 1) + fbncci2(n - 2);
    }

    public static void main(String[] args) {
        System.out.println("Fibonacci Rekursive : " + fbncci2(10));
    }
}
