package id.felis.modul3.praktikum;

public class fibonacci3 {
    /*
    FIBONACCI
     */
    public static long fbncci3(int n){
        if (n <= 1)
            return n;
        long fbncci1 = 0;
        long fbncci2 = 1;
        long result = 0;
        for (int i = 2; i <= n; i++) {
            result = fbncci2 + fbncci1;
            fbncci1 = fbncci2;
            fbncci2 = result;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Fibonacci : " + fbncci3(10));
    }
}
