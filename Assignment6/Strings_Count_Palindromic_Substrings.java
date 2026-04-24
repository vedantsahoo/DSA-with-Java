package Assignment6;

import java.util.Scanner;

public class Strings_Count_Palindromic_Substrings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(countPalindromes(s));
    }
    public static int countPalindromes(String s) {
        int totalCount = 0;
        for (int i = 0; i < s.length(); i++) {
            totalCount += expandAroundCenter(s, i, i);
            
            totalCount += expandAroundCenter(s, i, i + 1);
        }
        return totalCount;
    }
    private static int expandAroundCenter(String s, int left, int right) {
        int count = 0;
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            count++;
            left--;
            right++;
        }
        return count;
    }
}
