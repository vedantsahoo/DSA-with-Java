package Assignment6;

import java.util.Scanner;

public class Strings_Toggle_Case {
    public static String toggleCase(String s){
        StringBuilder sb=new StringBuilder();
        for(int i=0;i < s.length();i++){
            char ch=s.charAt(i);
            if(Character.isUpperCase(ch)){
                sb.append(Character.toLowerCase(ch));
            }else if(Character.isLowerCase(ch)){
                sb.append(Character.toUpperCase(ch));
            }else{
                sb.append(ch);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(toggleCase(s));
        sc.close();
    }    
}
