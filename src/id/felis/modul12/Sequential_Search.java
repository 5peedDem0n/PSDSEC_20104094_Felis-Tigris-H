package id.felis.modul12;

public class Sequential_Search {

    public static int sequential (int[] data, int search){

        for (int i = 0; i < data.length - 1; i++) {

            if (data[i] == search) return i;
        }

        return -1;
    }

    static void search (int[] data, int searchElement){

        int index = sequential(data, searchElement);

        if (index != -1){

            System.out.println("Searched item " + data[index] +
                    " found at index " + index);
        }

        else
            System.out.println("Searched item " + searchElement +
                    " not found in the array");
    }

}
