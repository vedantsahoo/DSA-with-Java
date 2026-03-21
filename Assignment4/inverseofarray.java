package Assignment4;

import java.util.Scanner;

public class inverseofarray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] inverted = new int[n];
        invertarr(arr,inverted,0,n);
        for (int i=0;i<n;i++){
            System.out.print(inverted[i]+" ");
        }
        sc.close();
    }
    public static void invertarr(int[] arr,int[] inverted, int index,int n){
        if (index==n) return;
        inverted[arr[index]]=index;
        invertarr(arr,inverted,index+1,n);
    }
}
