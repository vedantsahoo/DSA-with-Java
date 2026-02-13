package mediumlevelpatterns;
import java.util.Scanner;
public class PatternwithZeros {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int N=sc.nextInt();
        int i=1;
        while(i<=N){
            int j=1;
            while(j<=i){
                if(j==1 || j==i){
                    System.out.print(i+"\t");
                }
                else{
                    System.out.print(0+"\t");
                }
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
