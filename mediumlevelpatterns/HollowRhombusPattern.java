package mediumlevelpatterns;
import java.util.Scanner;
public class HollowRhombusPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int i=1;
        while(i<=N){
            int j=1;
            while(j<=N-i)
                System.out.print(" ");
                j++;
            j=1;
            while(j<=N)
                if(i==1||i==N||j==0||j==N)
                    System.out.print("*");
                else
                    System.out.print(" ");
                j++;
            System.out.println();
            i++;
        }
    }
}
