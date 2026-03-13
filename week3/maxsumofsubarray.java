package week3;
public class maxsumofsubarray {
    public static void main(String[] args) {
        int[] arr = {-2,1};
        int maxSum = findMaxSum(arr);
        System.out.println("Maximum subarray sum: " + maxSum);
    }
    public static int findMaxSum(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int j = 0; j < arr.length; j++) {
            int sum = 0;
            for (int i = j; i < arr.length; i++) {
                if (sum < 0) {
                    sum = arr[i];
                }else{ 
                sum = sum + arr[i];
                if (max<sum) max = sum;
                }
            }
        }
        return max;
    }
}
// time: O(n^2)
// space: O(1)