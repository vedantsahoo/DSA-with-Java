package mediumlevelpatterns;
import java.util.Scanner;
public class patternTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int i=1;
        while (i<=N){
            int j=1;
            while(j<=N-i){
                System.out.print("\t");
                j++;
            }
            j=1;
            int num=i;
            while(j<=i*2-1){
                if (j>i-1){
                    System.out.print(num+"\t");
                    num--;
                }
                else{
                    System.out.print(num+"\t");
                    num++;
                }    
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
