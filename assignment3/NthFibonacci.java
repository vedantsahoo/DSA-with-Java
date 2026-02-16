package assignment3;
import java.util.Scanner;
public class NthFibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long N=sc.nextLong();
        long a=0, b=1;
        int i=1;
        while (i<=N){
            long next=a+b;
            a=b;
            b=next;
            i++;
        }
        System.out.println(a);
    }
}

