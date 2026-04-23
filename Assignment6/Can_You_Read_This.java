package Assignment6;

import java.util.Scanner;

public class Can_You_Read_This {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        int start = 0;
        for (int i = 1; i < n; i++) {
            char curr = s.charAt(i);
            if (curr >= 'A' && curr <= 'Z') {
                System.out.println(s.substring(start, i));
                start = i;
            }
        }
        if (start < n) {
            System.out.println(s.substring(start));
        }
    }
}