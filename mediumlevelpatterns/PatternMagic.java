package mediumlevelpatterns;
import java.util.Scanner;
public class PatternMagic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); //N=5
        int i = 1;
        while (i<=N) {
            int j=1;
            while(j<=N-i+1){
                System.out.print("*");
                j++;
            }
            j=1;
            while(j<=i-1){  
                System.out.print(" ");
                j++;
            }
            j=1;
            while(j<=i-2){
                System.out.print(" ");
                j++;
            }
            j=1;
            while(j<=N-i+1){
                if (!(j==1&&i==1)){//when i=5 j=1 then skipping printing of *.
                    System.out.print("*");
                }
                j++;
            }
            System.out.println();
            i++;
        }
        i=N-1;
        while (i>=1) {
            int j=1;
            while(j<=N-i+1){
                System.out.print("*");
                j++;
            }
            j=1;
            while(j<=i-1){  
                System.out.print(" ");
                j++;
            }
            j=1;
            while(j<=i-2){
                System.out.print(" ");
                j++;
            }
            j=1;
            while(j<=N-i+1){
                if (!(j==1&&i==1)){
                    System.out.print("*");
                }
                j++;
            }
            System.out.println();
            i--;
        }
    }
}
