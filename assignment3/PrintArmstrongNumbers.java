package assignment3;

import java.util.Scanner;

public class PrintArmstrongNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();

        for(int i=n1;i<=n2;i++){
            if (IsArmstrong(i)){
                System.out.println(i);
            }
        }
    }
    public static boolean IsArmstrong (int num){
        int ogNum=num;
        // int digits=0;
        // while(num>0){
        //     digits++;
        //     num/=10;
        // }
        int digits=String.valueOf(num).length();
        
        int sum=0;
        while(num>0){
            int digit = num%10;
            sum = sum + (int)Math.pow(digit,digits);
            num = num/10;
        }
        return sum == ogNum;
    }
}
