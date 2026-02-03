package assignmests;
import java.util.Scanner;
public class addTwoNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter second number: ");
        int b = scanner.nextInt();
        int sum = a + b;
        System.out.println("The sum is: " + sum);
        scanner.close();
    }
}