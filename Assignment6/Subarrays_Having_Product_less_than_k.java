package Assignment6;

import java.util.Scanner;

public class Subarrays_Having_Product_less_than_k {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long k=sc.nextLong();
        long[] arr=new long[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextLong();
        }
        long count=0;
        long p=1;
        int l=0;
        for(int r=0;r < n;r++){
            if(arr[r]>=k){
                l = r+1;
                p=1;
                continue;
            }
            while(l <= r && p >(k-1)/arr[r]){
                p /= arr[l];
                l++;
            }
            p*=arr[r];
            count+=(r-l+1);
        }
        System.out.println(count);
        sc.close();
    }
}