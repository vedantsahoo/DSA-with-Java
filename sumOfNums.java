import java.util.Scanner;
public class sumOfNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer N: ");
        int N = sc.nextInt();
        int sum = 0;
        for (int i=0;i<=N;i++) {
            sum += i;
        }
        System.out.println("The sum of all integers from 0 to " + N + " is: " + sum);
        sc.close();
    }
}
