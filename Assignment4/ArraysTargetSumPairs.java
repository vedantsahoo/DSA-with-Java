package Assignment4;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysTargetSumPairs {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target = sc.nextInt();
        Arrays.sort(arr);
        targetSumPairs(arr,target);
    }
    public static void targetSumPairs(int[] arr,int target){
        int n=arr.length;
        int left=0,right=n-1;
        while(left<right){
            if(arr[left]+arr[right]==target){
                System.out.println(arr[left]+" and "+arr[right]);
                left++;
                right--;
            }
            else if (arr[left]+arr[right]>target) right--;
            else left++;
        }
    }
}