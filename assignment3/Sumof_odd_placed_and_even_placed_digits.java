package assignment3;
import java.util.Scanner;
public class Sumof_odd_placed_and_even_placed_digits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N = sc.nextInt();
        int sumOdd=0,sumEven=0,postion=1;
        while (N>0) {
            int digit = N%10;
            if (postion%2!=0){
                sumOdd+=digit;
            }else{
                sumEven+=digit;
            }
            N=N/10;
            postion++;
        }
        System.out.println(sumOdd);
        System.out.println(sumEven);
    }
}
