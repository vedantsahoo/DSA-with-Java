package Assignment4;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysTargetSumTriplets {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target = sc.nextInt();
        Arrays.sort(arr);
        targetSumTriplets(arr,target);
    }
    public static void targetSumTriplets(int[]arr,int target){
        int n=arr.length;
        for (int i=0;i<n-2;i++){
            int left=i+1,right=n-1;
            while(left<right){
                if(arr[i]+arr[left]+arr[right]==target){
                    System.out.println(arr[i]+", "+arr[left]+" and "+arr[right]);
                    left++;
                    right--;
                }
                else if (arr[i]+arr[left]+arr[right]>target) right--;
                else left++;
            }
        }
    }
}
