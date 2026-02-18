package assignment3;

import java.util.Scanner;
public class Replace_Them_All {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        long num=sc.nextLong();
        if (num==0){
            System.out.println(5);
        }else{
            long d = 0,plc = 1;
            while(num > 0){
                long cd = num % 10;
                if (cd==0){ cd=5; }
                d = d + cd * plc;
                plc = plc * 10;
                num = num / 10;
            }
            System.out.println(d);
        }
    }
}