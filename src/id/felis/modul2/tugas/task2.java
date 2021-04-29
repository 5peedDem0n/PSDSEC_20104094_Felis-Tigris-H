package id.felis.modul2.tugas;

import java.util.Random;

public class task2 {
    public static int maxSubSUm2(int[] a){
        int maxSum = 0;
        for (int i = 0; i < a.length; i++) {
            int thisSum = 0;

            for (int j = i; j < a.length; j++) {
                thisSum += a[j];

                if (thisSum > maxSum)
                    maxSum = thisSum;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        long begin = System.currentTimeMillis();//TIME START
        Random rand = new Random();//DEKLARASI RANDOM
        int a[] = new int[1000];//ARRAY DENGAN INDEKS 1000
        for (int i = 0; i < a.length; i++) {
            a[i] = rand.nextInt();
        }
        int maxSum = maxSubSUm2(a);
        System.out.println("Max sum is " + maxSum);

        long end = System.currentTimeMillis();//TIME END

        long time = end - begin;
        System.out.println();
        System.out.println("Elapsed Time = " + time + " milli seconds");
    }
}
