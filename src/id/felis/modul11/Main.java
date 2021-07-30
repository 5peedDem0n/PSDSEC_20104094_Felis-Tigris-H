package id.felis.modul11;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        //Deklarasi random
        Random random = new Random();
        // Array dengan indeks 100
        int[] array = new int[100];
        // Memasukkan nilai random ke setiap indeks array
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
        }

        //Deklarasi MergeSort
        MergeSort mergeSort = new MergeSort();

        long begin1 = System.currentTimeMillis();

        //Proses MergeSort
        System.out.println("MergeSort");
        mergeSort.sort(array, 0, array.length - 1);
        MergeSort.printArray(array);

        long end1 = System.currentTimeMillis();

        long begin2 = System.currentTimeMillis();

        //Proses QuickSort
        System.out.println("QuickSort");
        QuickSort.quickSort(array, 0, array.length - 1);
        QuickSort.printArray(array, array.length);

        long end2 = System.currentTimeMillis();

        long time1 = end1 - begin1;// Waktu MergeSort
        long time2 = end2 - begin2;// Waktu QuickSort
        System.out.println("Elapsed time MergeSort = " + time1 + " milli seconds");
        System.out.println("Elapsed time QuickSort = " + time2 + " milli seconds");

    }

}
