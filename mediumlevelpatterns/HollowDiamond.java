package mediumlevelpatterns;
import java.util.Scanner;
public class HollowDiamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int N = sc.nextInt();
        int center = N / 2;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                // Calculate distance from center
                int dy = Math.abs(center - i);
                int dx = Math.abs(center - j);

                if (dx >= (center - dy)) {
                    System.out.print("*\t");
                } else {
                    System.out.print(" \t");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}