package id.felis.modul10;

public class SelectionSort {

    public static void sort (int[] data){

        int n = data.length;

//        One by one move boundary of unsorted sub array
        for (int i = 0; i < n - 1; i++) {

            int minElement = i;

//            Find the minimum element in unsorted array
            for (int j = i + 1; j < n; j++) {

                if (data[j] < data[minElement])
                    minElement = j;

            }

//            Swap the found minimum element with the first element
            int temp = data[minElement];
            data[minElement] = data[i];
            data[i] = temp;
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
