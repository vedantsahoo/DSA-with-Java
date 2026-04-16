package Assignment5;

import java.util.Scanner;

public class Painters_Partition_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        long[] boards = new long[n];
        long low = 0;
        long high = 0;
        for (int i = 0; i < n; i++) {
            boards[i] = sc.nextLong();
            high += boards[i];
            low = Math.max(low, boards[i]);
        }
        System.out.println(partition(boards, k, low, high));
    }    
    public static long partition(long[] boards, int k, long low, long high) {
        long ans = high;   
        while (low <= high) {
            long mid = low + (high - low)/2;
            if (isPossible(boards, k, mid)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
    private static boolean isPossible(long[] boards, int k, long timeLimit) {
        int paintersRequired = 1;
        long currentTime = 0;        
        for (long board : boards) {
            if (currentTime + board > timeLimit) {
                paintersRequired++;
                currentTime = board;
                if (paintersRequired > k) return false;
            } else {
                currentTime += board;
            }
        }
        return true;
    }
}
