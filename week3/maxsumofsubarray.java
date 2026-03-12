package week3;
// import java.util.*;
public class maxsumofsubarray {
    public static void main(String[] args) {
        int[] arr = {1, -2, 3, 4, -5, 8};

        int maxSum = findMaxSum(arr);
        System.out.println("Maximum sum of a contiguous subarray: " + maxSum);
    }

    public static int findMaxSum(int[] arr) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            if (max < sum) {
                max = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        return max;
    }
}