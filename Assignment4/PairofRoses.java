package Assignment4;
import java.util.*;
public class PairofRoses {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n =sc.nextInt();
            int[] prices =new int[n];
            for (int i=0;i<n;i++){
                prices[i]=sc.nextInt();
            }
            int rate =sc.nextInt();
            sc.nextLine();
            Arrays.sort(prices);
            pairofRoses(prices,rate);
        }
    }
    public static void pairofRoses(int[]arr,int rate){
        int r1=0,r2=0;
        int i=0,j=arr.length-1;
        while(i<j){
            int sum=arr[i]+arr[j];
            if (sum==rate){
                r1=arr[i];r2=arr[j];
                i++;j--;
            }else if(sum<rate) i++;
            else j--;
        }
        System.out.println("Deepak should buy roses whose prices are "+ r1 +" and "+ r2 +".");
    }
}
