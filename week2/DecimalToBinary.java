package week2;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int b=0,plc=1;
        while (n>0){
            int r=n%2;
            b = b + (plc*r);
            plc=plc*10;
            n=n/2;
        }
        System.out.println(b);
    }
}