package Assignment4;

import java.util.Scanner;

public class MaximumSumPathinTwoArrays {
    public static int MaximumSum(int[]nums1,int[]nums2){
        int n=nums1.length;
        int m=nums2.length;
        int i=0,j=0;
        int sum1=0,sum2=0;
        int ans=0;
        while(i<n && j<m){
            if(nums1[i]<nums2[j]){
                sum1+=nums1[i];
                i++;
            }else if(nums1[i]>nums2[j]){
                sum2+=nums2[j];
                j++;
            }else{
                ans+=Math.max(sum1,sum2)+nums1[i];
                sum1=0;
                sum2=0;
                i++;
                j++;
            }
        }
        while(i<n){
            sum1+=nums1[i];
            i++;
        }
        while(j<m){
            sum2+=nums2[j];
            j++;
        }
        ans+=Math.max(sum1,sum2);
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int[] nums1=new int[n];
            int[] nums2=new int[m];
            for(int i=0;i<n;i++){
                nums1[i]=sc.nextInt();
            }
            for(int i=0;i<m;i++){
                nums2[i]=sc.nextInt();
            }
            int ans=MaximumSum(nums1,nums2);
            System.out.println(ans);
        }
    }
}
