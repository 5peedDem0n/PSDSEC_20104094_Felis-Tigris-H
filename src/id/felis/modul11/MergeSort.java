package id.felis.modul11;

public class MergeSort {

    void merge(int array[], int l, int m, int r){

        int n1 = m + 1 - l;
        int n2 = r - m;
        int L[] = new int[n1];
        int R[] = new int[n2];

        for (int i = 0; i < n1; ++i) {
            L[i] = array[l + i];
        }
        for (int j = 0; j < n2; ++j) {
            R[j] = array[m + j + 1];
        }

        int i = 0, j = 0;

        int k = l;

        while (i < n1 && j < n2){

            if (L[i] > R[j]){

                array[k] = R[j];
                j++;

            }
            else{

                array[k] = L[i];
                i++;

            }

            k++;
        }

        while (i < n1){

            array[k] = L[i];
            i++;
            k++;

        }

        while (j < n2){

            array[k] = R[j];
            j++;
            k++;

        }
    }

    void sort(int[] array, int l, int r){

        if (l < r){

            int m = (l + r) / 2;

            sort(array, l, m);
            sort(array, m + 1, r);

            merge(array, l, m, r);

        }
    }

    static void printArray(int array[]){

        int n = array.length;
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
