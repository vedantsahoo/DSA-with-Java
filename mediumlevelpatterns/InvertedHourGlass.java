package mediumlevelpatterns;
import java.util.Scanner;
public class InvertedHourGlass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int i = 1;
        while(i<=N){
            int j=1;
            int num = N;
            while(j<=i){
                System.out.print(num+" ");
                num--;
                j++;
            }
            j=1;
            while(j<2*N-2*i+2){
                System.out.print(" "+" ");
                j++;
            }
            j=1;
            num = N-i+1;
            while(j<=i){
                System.out.print(num+" ");
                num++;
                j++;
            }
            System.out.println();
            i++;
        }
        i=1;
        while(i==1){
            int num = N;
            int j=1;
            while(j<=N+1){
                System.out.print(num+" ");
                num--;
                j++;
            }
            num = 1;
            j=N;
            while(j>=1){
                System.out.print(num+" ");
                num++;
                j--;
            }
            i++;
        }
        System.out.println();
        i=N;
        while(i>=1){
            int j=1;
            int num = N;
            while(j<=i){
                System.out.print(num+" ");
                num--;
                j++;
            }
            j=1;
            while(j<2*N-2*i+2){
                System.out.print(" "+" ");
                j++;
            }
            j=1;
            num = N-i+1;
            while(j<=i){
                System.out.print(num+" ");
                num++;
                j++;
            }
            System.out.println();
            i--;
        }
    }
}
