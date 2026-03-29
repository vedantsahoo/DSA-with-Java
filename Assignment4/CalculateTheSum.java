package Assignment4;

import java.util.Scanner;

public class CalculateTheSum {
    static final int MOD=1000000007;
    static long power(long base,long exp){
        long res=1;
        base=base%MOD;
        while(exp>0){
            if(exp%2==1){
                res=(res*base)%MOD;
            }
            base=(base*base)%MOD;
            exp/=2;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long[] arr= new long[n];
        long curSum=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextLong();
            curSum=(curSum+arr[i])%MOD;
        }
        int q=sc.nextInt();
        for(int i=0;i<q;i++){
            sc.nextLine();
        }
        long multiplier=power(2,q);
        long ans=(curSum*multiplier)%MOD;
        System.out.println(ans);
    }
}
