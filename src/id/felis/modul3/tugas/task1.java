package id.felis.modul3.tugas;

public class task1 {
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
        long begin = System.currentTimeMillis();
        System.out.println("Fibonacci Iteratif : " + fbnacci1(50));
        long end = System.currentTimeMillis();

        long time = end - begin;
        System.out.println();
        System.out.println("Elapsed Time : " + time + " milli seconds");
    }
}
