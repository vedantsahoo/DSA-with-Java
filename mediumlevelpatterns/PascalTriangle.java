package mediumlevelpatterns;
import java.util.Scanner;
public class PascalTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // Number of rows in Pascal's Triangle
        for (int i = 0; i < N; i++) {
            int number = 1; // First number in each row is always 1
            for (int j = 0; j <= i; j++) {
                System.out.print(number + "\t");
                // Calculate the next number using the formula: C(n, k) = C(n, k-1) * (n - k + 1) / k
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}
