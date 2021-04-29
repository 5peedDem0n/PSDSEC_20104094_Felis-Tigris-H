package id.felis.modul2.praktikum;

public class MaxSum4 {
    public static int maxSubSum4 (int[] a){
        int maxSum = 0, thisSum = 0;
        for (int i = 0; i < a.length; i++) {
            thisSum += a[i];
            if (thisSum > maxSum)
                maxSum = thisSum;
            else  if (thisSum < 0)
                thisSum = 0;
        }

        return maxSum;
    }

    public static void main(String[] args) {

        int a[] = {4, -3, 5, -2, -1, 2, 6, -2};
        int maxSum = maxSubSum4(a);
        System.out.println("Max sum is " + maxSum);
    }
}
