package Assignment5;

import java.util.Scanner;

public class Arrays_WavePrintColumnWise {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int[][] grid=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                grid[i][j]=sc.nextInt();
            }
        }
        for(int j=0;j<n;j++){
            if(j%2==0){
                for(int i=0;i<m;i++){
                    System.out.print(grid[i][j]+(i==m-1&&j==n-1?", END":", "));
                }
            }else{
                for(int i=m-1;i>=0;i--){
                    System.out.print(grid[i][j]+(i==0&&j==n-1?", END":", "));
                }
            }
        }
    }
}
