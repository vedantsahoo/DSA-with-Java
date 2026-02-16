package assignment3;
import java.util.Scanner;
public class checkPrime {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int N = sc.nextInt();
        int i=1,cnt=0;
        while(i*i<=N){
            if(N%i==0){
                cnt++;
                if (i!=N/i){
                    cnt++;
                }
            }
            i++;
        }
        if (cnt==2) {System.out.println("Prime");}
        else {System.out.println("Not Prime");}
    }
}
