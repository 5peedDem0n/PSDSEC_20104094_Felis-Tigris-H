package id.felis.modul10;

public class InsertionSort {

//    Function to sort array using insertion sort
    public static void sort(int[] data){

        int n = data.length;

        for (int i = 1; i < n; i++) {

            int key = data[i];
            int j = i - 1;

//            Move elements of data[0..i - 1], that are
//            greater than key, to one position ahead of
//            their current position
            while (j >= 0 && data[j] > key){

                data[j + 1] = data[j];
                j = j -1;
            }

            data[j + 1] = key;
        }
    }

//    to show array
    static void printArray(int[] array){

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

    }

    public static void main(String[] args) {

        int[] a = {5,2,4,3,6,1};
        sort(a);
        printArray(a);
    }
}
