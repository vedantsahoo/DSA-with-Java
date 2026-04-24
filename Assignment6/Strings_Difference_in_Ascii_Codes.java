package Assignment6;

import java.util.Scanner;

public class Strings_Difference_in_Ascii_Codes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
        System.out.println(insertAsciiDifference(s));
        sc.close();
    }
    public static String insertAsciiDifference(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length() - 1; i++) {
            char current = s.charAt(i);
            char next = s.charAt(i + 1);
            int diff = next - current;
            sb.append(current);
            sb.append(diff);
        }
        sb.append(s.charAt(s.length() - 1));
        return sb.toString();
    }
}
