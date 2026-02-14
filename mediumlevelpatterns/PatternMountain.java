package mediumlevelpatterns;
import java.util.Scanner;
public class PatternMountain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int i = 1;
        while (i<=N) {
            int j = 1;
            while (j <= i) {
                System.out.print(j + "\t");
                j++;
            }
            while (j<2*N-i) {//when i=4 j=1234321
                System.out.print("\t");
                j++;
            }
            int k = i;
            while (k >= 1) {
                if(!(k==N)){//for i=4 k=4321 but skipping 4 from printing. 
                    System.out.print(k + "\t");
                } 
                k--;
            }
            System.out.println();
            i++;
        }
    }
}
