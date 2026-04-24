package Assignment6;

import java.util.Scanner;

public class Strings_Remove_Duplicates {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s = sc.next();
        System.out.println(removeDuplicates(s));
        sc.close();
    }
    public static String removeDuplicates(String s){
        StringBuilder sb = new StringBuilder();
        sb.append(s.charAt(0));
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)!=s.charAt(i-1)){
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}
