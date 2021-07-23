package id.felis.modul10;

public class BubbleSort {

    public static void sort (int[] data){

        int n = data.length;

        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - i - 1; j++) {

                if (data[j] > data[j + 1]){

                    // swap temp and data[i]
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;

                }
            }
        }
    }

    //to show array
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
