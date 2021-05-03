package id.felis.modul3.tugas;

public class task2 {
    /*
   FIBONACCI REKURSIVE
    */
    public static long fbncci2(int n){
        if (n <= 1)
            return n;
        else return fbncci2(n - 1) + fbncci2(n - 2);
    }

    public static void main(String[] args) {
        long begin = System.currentTimeMillis();
        System.out.println("Fibonacci Rekursive : " + fbncci2(50));
        long end = System.currentTimeMillis();

        long time = end - begin;
        System.out.println();
        System.out.println("Elapsed Time : " + time + " milli seconds");
    }
}
