package assignment3;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {    
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        System.out.println(findLCM(n1,n2));
    }
    public static int findLCM (int n1,int n2){
        if(n1==0||n2==0){return 0;}
        int gcd = findGCD(n1,n2);
        int LCM = (n1*n2) / gcd;
        return LCM;
    }
    public static int findGCD(int a,int b){
        while (b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
}
