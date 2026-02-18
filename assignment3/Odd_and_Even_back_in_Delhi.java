package assignment3;

import java.util.Scanner;

public class Odd_and_Even_back_in_Delhi {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int N = sc.nextInt();
        while (N>0){
            long carNum = sc.nextLong();
            int sumEven=0,sumOdd=0;
            while(carNum>0){
                long digit = carNum % 10;
                if(digit%2==0){
                    sumEven=sumEven + (int)digit;
                }else{
                    sumOdd=sumOdd + (int)digit;
                }
                carNum=carNum / 10;
            }
            if (sumEven%4==0 || sumOdd%3==0) {
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
            N--;
        }
    }
}
