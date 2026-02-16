package assignment3;
import java.util.Scanner;
public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int digit=sc.nextInt();
        int rep = countDigitRep(num,digit);
        System.out.println(rep);
    }
    public static int countDigitRep(int n, int d){
        if (n==0&&d==0) {return 1;}
        int cnt=0;
        while (n>0) {
            int cd = n%10;
            if (cd==d){
                cnt++;
            }
            n=n/10;
        }
        return cnt;
    }
}
