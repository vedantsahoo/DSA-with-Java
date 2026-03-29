package Assignment4;

import java.util.*;
public class AlexGoesShopping {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(); //no. of items
        int[]prices=new int[n];
        for(int i=0;i<n;i++){
            prices[i]=sc.nextInt();//price of each item
        }
        int q=sc.nextInt();//no. of queries
        while(q-->0){
            int A=sc.nextInt();
            int k=sc.nextInt();
            int count=0;
            for (int p : prices){
                if(A%p==0){
                    count++;
                }
            }
            if(count>=k) System.out.println("Yes");
            else System.out.println("No");
        }
    }
}