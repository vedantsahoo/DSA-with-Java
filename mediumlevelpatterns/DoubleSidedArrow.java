package mediumlevelpatterns;
import java.util.Scanner;
public class DoubleSidedArrow {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();//N should be odd
        int i=1;
        int num=i;
        while(i<=N/2+1){
            int j=1;
            while(j<=N-2*i+1){
                System.out.print(" "+" ");
                j++;
            }
            j=1;
            num = i;
            while(j<=i){
                System.out.print(num+" ");
                num--;
                j++;
            }
            j=1;
            while(j<i+i-2){
                System.out.print(" "+" ");
                j++;
            }
            j=1;
            num = 1;
            while(j<=i && i!=1){
                System.out.print(num+" ");
                num++;
                j++;
            }
            System.out.println();
            i++;
        }
        i=N/2;
        while(i>=1){
            int j=1;
            while(j<=N-2*i+1){
                System.out.print(" "+" ");
                j++;
            }
            j=1;
            num = i;
            while(j<=i){
                System.out.print(num+" ");
                num--;
                j++;
            }
            j=1;
            while(j<i+i-2){
                System.out.print(" "+" ");
                j++;
            }
            j=1;
            num = 1;
            while(j<=i && i!=1){
                System.out.print(num+" ");
                num++;
                j++;
            }
            System.out.println();
            i--;
        }
    }
}
