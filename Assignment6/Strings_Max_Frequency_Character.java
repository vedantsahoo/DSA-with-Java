package Assignment6;

import java.util.*;
public class Strings_Max_Frequency_Character {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String S=sc.next();
        System.out.println(mostfreq(S));
    }
    public static char mostfreq(String s){
        int[]freq=new int[128];
        int maxCount=0;
        char res=' ';

        for(int i=0;i<s.length();i++){
            char current = s.charAt(i);
            freq[current]++;

            if(freq[current] > maxCount){
                maxCount = freq[current];
                res = current;
            }
        }
        return res;
    }
}