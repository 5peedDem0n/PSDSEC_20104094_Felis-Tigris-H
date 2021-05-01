package id.felis.modul2.praktikum;

public class MaxSum1 {

    public static int maxSubSum1 (int[] a){
        int maxSum = 0;
        for (int i = 0; i < a.length; i++) {
            //System.out.println("Perulangan\t: " + i);

            for (int j = i; j < a.length; j++) {
                //System.out.println("Perulangan-2\t: " + j);
                int thisSum = 0;

                for (int k = i; k <= j ; k++) {
                //    System.out.println("thisSum before = " + thisSum);
                //    System.out.println("k = " + k);
                    thisSum += a[k];
                //    System.out.println("thisSum after = " + thisSum);
                }

                if (thisSum > maxSum)
                    maxSum = thisSum;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {

        int a[] = {4, -3, 5, -2, -1, 2, 6, -2};
        int maxSum = maxSubSum1(a);
        System.out.println("Max sum is " + maxSum);
    }
}
