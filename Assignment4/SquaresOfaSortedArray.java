package Assignment4;

import java.util.Arrays;
import java.util.Scanner;

public class SquaresOfaSortedArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            arr[i]=arr[i]*arr[i];
        }
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n-1-i;j++){
        //         if (arr[j]>arr[j+1]){
        //             int temp=arr[j];
        //             arr[j]=arr[j+1];
        //             arr[j+1]=temp;
        //         }
        //     }
        // }
        Arrays.sort(arr);
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
