package Assignment5;

import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextLong()) {
            long a = sc.nextLong();
            System.out.println(sqrt(a));
        }
    }
    public static long sqrt(long a) {
        // Base cases for 0 and 1
        if (a < 2) return a;

        long low = 1;
        long high = a / 2;
        long ans = 0;

        while (low <= high) {
            long mid = low + (high - low) / 2;
            
            // To prevent mid * mid overflow even with long, 
            // you can use division: mid <= a / mid
            if (mid <= a / mid) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }
}
