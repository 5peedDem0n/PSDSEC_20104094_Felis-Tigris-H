package id.felis.modul12;

public class Binary_Search {

    static int binary(int[] array, int x){

        int left = 0, right = array.length - 1;

        while (left <= right){

            int mid = left + (right - left) / 2;

            if (array[mid] == x) return mid;
            else if (array[mid] < x) left = mid + 1;
            else right = mid - 1;

        }

        return -1;
    }

    static void search (int[] data, int searchElement){

        int index = binary(data, searchElement);

        if (index != -1){

            System.out.println("Searched item " + data[index] +
                    " found at index " + index);
        }

        else
            System.out.println("Searched item " + searchElement +
                    " not found in the array");
    }
}
