package Assignment6;

import java.util.Scanner;

public class Playing_with_Good_String {
    public static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
    public static int longestGoodString(String s) {
        int maxLength = 0;
        int currentLength = 0;

        for (int i = 0; i < s.length(); i++) {
            if (isVowel(s.charAt(i))) {
                currentLength++;
                maxLength = Math.max(maxLength, currentLength);
            } else {
                currentLength = 0;
            }
        }
        return maxLength;
    }
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(longestGoodString(s));
        sc.close();
    }
}
