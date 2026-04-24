package Assignment6;

import java.util.Scanner;

public class Kartik_Bhaiya_And_Strings {
    public static int findMaxPerfectness(String s, int k, char target) {
        int left = 0;
        int right = 0;
        int maxLen = 0;
        int flipCount = 0;
        while (right < s.length()) {
            if (s.charAt(right) != target) {
                flipCount++;
            }
            while (flipCount > k) {
                if (s.charAt(left) != target) {
                    flipCount--;
                }
                left++;
            }
            maxLen = Math.max(maxLen, right - left + 1);
            right++;
        }
        return maxLen;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        String s = sc.next();
        int maxA = findMaxPerfectness(s, k, 'a');
        int maxB = findMaxPerfectness(s, k, 'b');
        System.out.println(Math.max(maxA, maxB));
        sc.close();
    }
}
