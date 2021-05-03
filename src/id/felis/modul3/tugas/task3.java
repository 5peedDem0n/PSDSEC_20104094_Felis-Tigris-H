package id.felis.modul3.tugas;

public class task3 {
    /*
    FIBONACCI ITERATIF
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
        long begin = System.currentTimeMillis();
        System.out.println("Fibonacci : " + fbncci3(50));
        long end = System.currentTimeMillis();

        long time = end - begin;
        System.out.println();
        System.out.println("Elapsed Time : " + time + " milli seconds");
    }
}
