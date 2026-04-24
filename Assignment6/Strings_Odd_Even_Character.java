package Assignment6;

import java.util.Scanner;

public class Strings_Odd_Even_Character {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(modifyString(s));
        sc.close();
    }
    public static String modifyString(String s){
        StringBuilder sb=new StringBuilder(s.length());
        for (int n=0;n< s.length();n++){
            char ch=s.charAt(n);
            if(n % 2 ==0) sb.append((char)(ch + 1));
            else sb.append((char)(ch - 1));
        }
        return sb.toString();
    }
}
