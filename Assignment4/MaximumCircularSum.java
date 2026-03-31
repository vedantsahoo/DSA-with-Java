package Assignment4;

import java.util.*;

public class MaximumCircularSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }
            System.out.println(maxCircularSum(nums));
        }
        sc.close();
    }
    public static int maxCircularSum(int[] nums) {
        int totalSum = 0;
        int currMax = 0, maxSum = nums[0];
        int currMin = 0, minSum = nums[0];

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            totalSum += num;
            
            // Standard Kadane's for max sum
            currMax = Math.max(currMax + num, num);
            maxSum = Math.max(maxSum, currMax);
            
            // Inverted Kadane's for min sum
            currMin = Math.min(currMin + num, num);
            minSum = Math.min(minSum, currMin);
        }
        if (maxSum < 0) {
            return maxSum;
        }
        return Math.max(maxSum, totalSum - minSum);
    }
}
