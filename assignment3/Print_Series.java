package assignment3;

import java.util.Scanner;
public class Print_Series {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n1= sc.nextInt();
        int n2= sc.nextInt();
        printSeries(n1, n2);
    }
    public static void printSeries(int n1,int n2){
        int cnt=0;
        int n=1;
        while (cnt < n1){
            int term = 3*n+2;
            if (term%n2!=0){
                System.out.println(term);
                cnt++;
            }
            n++;
        }
    }
}
