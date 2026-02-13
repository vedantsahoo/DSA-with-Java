package mediumlevelpatterns;
import java.util.Scanner;
public class MagicStarPattern5 {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int i=1;
        while(i<=N/2+1){
            int j=1;
            while(j<=N/2+1-i){
                System.out.print("\t");
                j++;
            }
            j=1;
            while(j<=i+i-1){
                System.out.print("*\t");
                j++;
            }
            System.out.println();
            i++;
        }
        i=N/2;
        while(i>=1){
            int j=1;
            while(j<=N/2+1-i){
                System.out.print("\t");
                j++;
            }
            j=1;
            while(j<=i+i-1){
                System.out.print("*\t");
                j++;
            }
            System.out.println();
            i--;
        }            
    }
}
