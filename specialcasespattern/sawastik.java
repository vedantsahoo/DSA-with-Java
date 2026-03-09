package specialcasespattern;
import java.util.Scanner;
public class sawastik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); //N=7
        int i = 0;
        while (i<N) {
            int j=0;
            while(j<N){
                if (i==(N)/2||j==(N)/2){
                    System.out.print("* ");
                }
                else if((i==0&&j==0)||(i==0&&j==N-1)||(i==N-1&&j==0)||(i==N-1&&j==N-1)){
                    System.out.print("* ");
                }
                else if((i==0&&j>N/2)||(i<N/2&&j==0)||(i>N/2&&j==N-1)||(i==N-1&&j<N/2)){
                    System.out.print("* ");
                }
                else{
                    System.out.print("- ");
                }
                j++;
            }
            System.out.println();
            i++;
        }
    }
}