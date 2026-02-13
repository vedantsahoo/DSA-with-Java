package mediumlevelpatterns;
import java.util.Scanner;
public class FabonacciPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rows = sc.nextInt();
        int a = 0, b = 1;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(a + "\t");
                
                int next = a + b;
                a = b;
                b = next;
            }
            System.out.println();
        }
    }
}