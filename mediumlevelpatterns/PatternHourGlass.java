package mediumlevelpatterns;
import java.util.Scanner;
public class PatternHourGlass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N = sc.nextInt();
        int i=1;
        while(i<=N+1){
            int num = N-i+1;
            int j=1;
            while(j<=i-1){
                System.out.print(" "+" ");
                j++;
            }
            while(j<=N+1){
                System.out.print(num+" ");
                num--;
                j++;
            }
            num = 1;
            j=N-i+1;
            while(j>=1){
                System.out.print(num+" ");
                num++;
                j--;
            }
            System.out.println();
            i++;
        }
        i=N;
        while(i>=1){
            int num = N-i+1;
            int j=1;
            while(j<=i-1){
                System.out.print(" "+" ");
                j++;
            }
            while(j<=N+1){
                System.out.print(num+" ");
                num--;
                j++;
            }
            num = 1;
            j=N-i+1;
            while(j>=1){
                System.out.print(num+" ");
                num++;
                j--;
            }
            System.out.println();
            i--;
        }
    }
}
