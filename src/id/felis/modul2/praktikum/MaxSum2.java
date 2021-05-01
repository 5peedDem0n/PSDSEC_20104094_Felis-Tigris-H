package id.felis.modul2.praktikum;



public class MaxSum2 {
    public static int maxSubSUm2(int[] a){
        int maxSum = 0;
        for (int i = 0; i < a.length; i++) {
            int thisSum = 0;

            for (int j = i; j < a.length; j++) {
                thisSum += a[j];

                if (thisSum > maxSum)
                    maxSum = thisSum;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {

        int a[] = {4, -3, 5, -2, -1, 2, 6, -2};
        int maxSum = maxSubSUm2(a);
        System.out.println("Max sum is " + maxSum);
    }
}
