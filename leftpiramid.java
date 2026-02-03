import java.util.Scanner;

public class leftpiramid {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 0;
        while (row<n) {
            int col = 0;
            while (col<=row){
                System.out.print("*");
                col++;
            }
            System.out.println("");
            row++;
        }
        sc.close();
    }
}
