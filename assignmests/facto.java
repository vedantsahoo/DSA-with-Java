package assignmests;
import java.util.Scanner;
public class facto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer to calculate its factorial: ");
        int num =sc.nextInt();
        int facto=1;
        for(int i=1;i<=num;i++){
            facto=facto*i;
        }
        System.out.println("The factorial of "+num+" is: "+facto);
        sc.close();
    }
}