package specialcasespattern;
import java.util.Scanner;
public class numtriange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i=1;    
        while(i<=n){
            int j=1;
            while(j<=n-i){
                System.out.print("\t");
                j++;
            }
            j=1;
            int num=i;
            while(j<2*i){
                System.out.print(num + "\t");
                if (j>((2*i-1)/2)) num--;
                else num++;
                j++;
            }
            System.out.println();
            i++;
        }
        sc.close();
    }
}