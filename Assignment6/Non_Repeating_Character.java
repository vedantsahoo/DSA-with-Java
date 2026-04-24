package Assignment6;

import java.util.Scanner;

public class Non_Repeating_Character {
    public static void findFirstNonRepeating(String s) {
        // Array to store the frequency of each ASCII character
        int[] freq = new int[256];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)]++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i)] == 1) {
                System.out.println(s.charAt(i));
                return;
            }
        }
        System.out.println("-1");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String s=sc.next();
            findFirstNonRepeating(s);
        }
        sc.close();
    }
}