package id.felis.modul12;

public class Interpolation_Search {

    static int interpolation (int[] array, int x){

        int low = 0, high = array.length - 1;

        while (low <= high && x >= array[low] && x <= array[high]){

            if (low == high){

                if (array[low] == x) return low;
                return -1;

            }

            int position = low + (((high - low) / (array[high] - array[low])) * (x - array[low]));

            if (array[position] == x) return position;
            else if (array[position] < x) low = position + 1;
            else high = position - 1;
        }
        return -1;
    }

    static void search (int[] data, int searchElement){

        int index = interpolation(data, searchElement);

        if (index != -1){

            System.out.println("Searched item " + data[index] +
                    " found at index " + index);
        }

        else
            System.out.println("Searched item " + searchElement +
                    " not found in the array");
    }

}
