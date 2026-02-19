package assignment3;

import java.util.*;

public class BostonNumbers {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (sc.hasNextLong()) {
            long n = sc.nextLong();
            
            // Output 1 if it's a Boston number, 0 otherwise
            if (isBoston(n)) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
        sc.close();
    }

    // Helper function to calculate the sum of digits of a given number
    public static long sumOfDigits(long num) {
        long sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public static boolean isBoston(long n) {
        long sumDigitsN = sumOfDigits(n);
        long sumDigitsFactors = 0;
        long temp = n;

        // Find prime factors and sum their digits
        // We use i * i <= temp to optimize the loop (O(sqrt(N)) time complexity)
        for (long i = 2; i * i <= temp; i++) {
            while (temp % i == 0) {
                sumDigitsFactors += sumOfDigits(i);
                temp /= i;
            }
        }

        // If temp is greater than 1, it means the remaining temp is a prime factor itself
        if (temp > 1) {
            sumDigitsFactors += sumOfDigits(temp);
        }

        // A Boston number MUST be a composite number.
        // If 'temp' remained completely unchanged (temp == n), it means 'n' had no 
        // divisors other than 1 and itself, making it a prime number.
        if (temp == n) {
            return false;
        }

        // Return true if the sum of digits matches
        return sumDigitsN == sumDigitsFactors;
    }
}
