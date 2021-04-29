package id.felis.modul2.tugas;

import java.util.Random;

public class task1 {
    public static int maxSubSum1 (int[] a){
        int maxSum = 0;
        for (int i = 0; i < a.length; i++) {
            //System.out.println("Perulangan\t: " + i);

            for (int j = i; j < a.length; j++) {
                //System.out.println("Perulangan-2\t: " + j);
                int thisSum = 0;

                for (int k = i; k <= j ; k++) {
                    //    System.out.println("thisSum before = " + thisSum);
                    //    System.out.println("k = " + k);
                    thisSum += a[k];
                    //    System.out.println("thisSum after = " + thisSum);
                }

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
        int maxSum = maxSubSum1(a);//MEMANGGIL METHOD maxSubSum1
        System.out.println("Max sum is " + maxSum);
        long end = System.currentTimeMillis();//TIME END

        long time = end - begin;
        System.out.println();
        System.out.println("Elapsed Time = " + time + " milli seconds");

    }
}
