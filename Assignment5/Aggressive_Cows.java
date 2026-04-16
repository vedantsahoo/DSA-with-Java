package Assignment5;

import java.util.Arrays;
import java.util.Scanner;

public class Aggressive_Cows {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=sc.nextInt();
        int[]stalls=new int[n];
        for(int i=0;i<n;i++){
            stalls[i]=sc.nextInt();
        }
        Arrays.sort(stalls);
        System.out.println(solve(stalls, n, c));
    }
    public static int solve(int[] stalls,int n,int c){
        int low=0;
        int high=stalls[n-1]-stalls[0];
        int distance=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(isPossible(stalls,c,mid)){
                distance=mid;
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return distance;
    }
    public static boolean isPossible(int[]stalls,int c,int minDist){
        int cowsPlaced=1;//first cow in the first stall
        int lastPost=stalls[0];
        for(int i=1;i<stalls.length;i++){
            if(stalls[i]-lastPost>=minDist){
                cowsPlaced++;
                lastPost=stalls[i];
                if(cowsPlaced==c) return true;
            }
        }
        return false;
    }
}
