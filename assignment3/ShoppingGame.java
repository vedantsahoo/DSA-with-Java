package assignment3;

import java.util.Scanner;

public class ShoppingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int t = sc.nextInt(); // Number of test cases
            while (t-- > 0) {
                int m = sc.nextInt(); // Aayush's limit
                int n = sc.nextInt(); // Harshit's limit
                int aayushTotal = 0;
                int harshitTotal = 0;
                int currentPurchase = 1;
                // Simulate the game turn by turn
                while (true) {
                    if (currentPurchase % 2 != 0) {
                        // Aayush's turn (odd numbers)
                        aayushTotal += currentPurchase;
                        if (aayushTotal > m) {
                            System.out.println("Harshit");
                            break;
                        }
                    } else {
                        // Harshit's turn (even numbers)
                        harshitTotal += currentPurchase;
                        if (harshitTotal > n) {
                            System.out.println("Aayush");
                            break;
                        }
                    }
                    currentPurchase++;
                }
            }
        }
        sc.close();
    }
}
