package Assignment5;

import java.util.Scanner;

public class Piyush_and_Magical_Park {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int k=sc.nextInt();
        int s=sc.nextInt();
        char[][]park=new char[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                park[i][j]=sc.next().charAt(0);
            }
        }
        escapePark(park,n,m,k,s);
    }
    static void escapePark(char[][]park,int n,int m,int k,int s){
        boolean canEscape=true;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(s<k){
                    canEscape=false;
                    break;
                }
                char curCell = park[i][j];
                
                if(curCell=='*') s+=k;
                else if(curCell=='.') s-=2;
                else if(curCell=='#') break;
                if(j!=m-1){
                    s-=1;
                }
            }
            if(!canEscape) break;
        }
        if(canEscape && s>=k){
            System.out.println("Yes");
            System.out.println(s);
        }else{
            System.out.println("No");
        }
    }
}
