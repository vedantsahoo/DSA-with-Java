import java.util.Scanner;
public class pat_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 0;
        while (row<n) {
            int col = 0;
            while (col<n){
                System.out.print("*");
                col++;
            }
            System.out.println("");
            row++;
        }
        sc.close();
    }
}