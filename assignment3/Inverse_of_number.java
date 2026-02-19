package assignment3;

import java.util.Scanner;

public class Inverse_of_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            System.out.println(getInverse(n));
        }
        sc.close();
    }
    public static int getInverse(int n) {
        int inverse = 0;
        int position = 1;
        while (n > 0) {
            int digit = n % 10;
            // The 'position' becomes the new digit, and the 'digit' dictates its new place value
            // Math.pow(10, digit - 1) shifts the new digit to the correct position
            inverse += position * (int) Math.pow(10, digit - 1);
            n /= 10;
            position++;
        }
        return inverse;
    }
}
