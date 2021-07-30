package id.felis.modul12;

public class Main {

    public static void main(String[] args) {

        int[] array = {128, 4, 8, 64, 2, 32};

        SelectionSort.sort(array);
        for(int x : array){
            System.out.print(x + ", ");
        }
        System.out.println();

        System.out.println("Sequential Search");
        Sequential_Search.search(array, 8);

        System.out.println("Interpolation Search");
        Interpolation_Search.search(array, 4);

        System.out.println("Binary Search");
        Binary_Search.search(array, 2);
    }
}
