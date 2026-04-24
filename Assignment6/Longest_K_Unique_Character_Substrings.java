package Assignment6;

import java.util.Scanner;

public class Longest_K_Unique_Character_Substrings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            String s = sc.next();
            int k = sc.nextInt();
            System.out.println(longestSubstringKUnique(s, k));
        }
        sc.close();
    }
    public static int longestSubstringKUnique(String s, int k) {
        int[] freq = new int[256];
        int left = 0;
        int uniqueCount = 0;
        int maxLength = -1;

        for (int right = 0; right < s.length(); right++) {
            char rightChar = s.charAt(right);
            if (freq[rightChar] == 0) {
                uniqueCount++;
            }
            freq[rightChar]++;
            while (uniqueCount > k) {
                char leftChar = s.charAt(left);
                freq[leftChar]--;
                if (freq[leftChar] == 0) {
                    uniqueCount--;
                }
                left++;
            }
            if (uniqueCount == k) {
                maxLength = Math.max(maxLength, right - left + 1);
            }
        }

        return maxLength;
    }
}
