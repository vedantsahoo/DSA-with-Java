package Assignment4;

import java.util.*;

public class CalculateTheSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long[] arr= new long[n];
        long curSum=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextLong();
            curSum=(curSum+arr[i]);
        }
        int q=sc.nextInt();
        for(int i=0;i<q;i++){
            sc.nextLine();
        }
        long multiplier=(long)Math.pow(2,q);
        long ans=(curSum*multiplier);
        System.out.println(ans);
    }
}
