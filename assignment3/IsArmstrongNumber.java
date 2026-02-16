package assignment3;

import java.util.Scanner;
public class IsArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        isArmstrongNum(n);
    }
    public static void isArmstrongNum(int n){
        int copy=n;
        int cnt=0;
        while(n>0){
            cnt++;
            n=n/10;
        }
        n=copy;
        int sum=0;
        while(n>0){
            int d=n%10;
            int powerdigit=1;
            for(int i=1;i<=cnt;i++){
                powerdigit=powerdigit*d;
            }
            sum=sum+powerdigit;
            n=n/10;
        }
        if(copy==sum) System.out.println("true");
        else System.out.println("false");
    }
}
