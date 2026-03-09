package specialcasespattern;

import java.util.Scanner;

public class squarewithdiagonals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // N=7
        int i = 0;
        while (i < N) {
            int j = 0;
            while (j < N) {
                if (i == 0 || i == N - 1 || j == 0 || j == N - 1 || i == j || i + j == N - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("- ");
                }
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
