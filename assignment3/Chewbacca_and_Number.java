package assignment3;

import java.util.Scanner;

public class Chewbacca_and_Number {
        public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        long d=0,p=1;
        while (num>0){
            long ogd = (num)%10;
            long invert = 9 - ogd;
            if (num<10){
                if (invert<ogd && ogd!=9){
                    ogd=invert;
                }
            }else{
                if(invert<ogd){
                    ogd=invert;
                }
            }
            d=d+ogd*p;
            p=p*10;
            num=num/10;
        }
        System.out.println(d);
    }
}