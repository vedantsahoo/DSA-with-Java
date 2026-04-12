package Assignment5;

import java.util.Scanner;

public class Kth_Root {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long n=sc.nextLong();
            int k=sc.nextInt();
            System.out.println(findMaxX(n, k));
        }
    }
    public static long findMaxX(long n, int k) {
        if (n == 1) return 1;
        if (k == 1) return n;

        long low = 1;
        // Since k >= 2 and n <= 10^15, x cannot exceed 10^8 (10^8^2 = 10^16)
        long high = (long) Math.min(n, 1_000_000_000L);
        long ans = 1;

        while (low <= high) {
            long mid = low + (high - low) / 2;
            
            if (check(mid, k, n)) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    // Helper method to calculate mid^k and compare with n while preventing overflow
    private static boolean check(long mid, int k, long n) {
        if (mid == 0) return true;
        long res = 1;
        for (int i = 0; i < k; i++) {
            // Check if multiplying res by mid will overflow a long
            if (n / mid < res) { 
                return false; // mid^k > n
            }
            res *= mid;
        }
        return res <= n;
    }
}
