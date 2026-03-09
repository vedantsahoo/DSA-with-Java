package specialcasespattern;

import java.util.Scanner;


public class reversetriangleofnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // N=7
        int i = 0;
        while (i < N) {
            int space = 0;
            while (space < i) {
                System.out.print(" ");
                space++;
            }
            int j = 0;
            int num = i+1;
            while (j < N - i) {
                System.out.print((num) + " ");
                num++;
                j++;
            }
            System.out.println();
            i++;
        }
        i=N-1;
        while (i >= 0) {
            int space = 0;
            while (space < i) {
                System.out.print(" ");
                space++;
            }
            int j = 0;
            int num = i+1;
            while (j < N - i) {
                System.out.print((num) + " ");
                num++;
                j++;
            }
            System.out.println();
            i--;
        }
    }
}
