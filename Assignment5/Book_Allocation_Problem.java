package Assignment5;

import java.util.Scanner;

public class Book_Allocation_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] pages = new int[n];
            int sum = 0;
            int maxVal = 0;
            for (int i = 0; i < n; i++) {
                pages[i] = sc.nextInt();
                sum += pages[i];
                maxVal = Math.max(maxVal, pages[i]);
            }
            System.out.println(findPages(pages, n, m, maxVal, sum));
        }
    }
    public static int findPages(int[] pages, int n, int m, int low, int high) {
        if (m > n) return -1;

        int ans = high;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            if (isPossible(pages, n, m, mid)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
    private static boolean isPossible(int[] pages, int n, int m, int mid) {
        int studentsRequired = 1;
        int currentSum = 0;
        
        for (int i = 0; i < n; i++) {
            if (currentSum + pages[i] > mid) {
                studentsRequired++;
                currentSum = pages[i];
                if (studentsRequired > m) return false;
            } else {
                currentSum += pages[i];
            }
        }
        return true;
    }
}
