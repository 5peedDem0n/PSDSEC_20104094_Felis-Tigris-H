package id.felis.modul11;

public class QuickSort {

    static void swap(int[] array, int i, int j){

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;

    }

    static int partition(int[] array, int low, int high){

        int pivot = array[high];
        int i = (low - 1);

        for (int j = low; j <= high - 1; j++) {

            if (array[j] < pivot){

                i++;
                swap(array, i, j);

            }
        }

        swap(array, i + 1, high);
        return (i + 1);
    }

    static void quickSort(int[] array, int low, int high){

        if (low < high){

            int pi = partition(array, low, high);
            quickSort(array, low, pi - 1);
            quickSort(array, pi + 1, high);

        }
    }

    static void printArray(int[] array, int size){

        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

    }
}