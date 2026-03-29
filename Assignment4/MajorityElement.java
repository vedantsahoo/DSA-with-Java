package Assignment4;

import java.util.Scanner;

public class MajorityElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int cnt=0;
        int major=0;
        for(int i=0;i<n;i++){
            int num=sc.nextInt();
            if (cnt==0){
                major=num;
            }
            if(num==major) cnt++;
            else cnt--;
        }
        System.out.println(major);
    }
}
