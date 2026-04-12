package Assignment5;

import java.util.Scanner;

public class Arrays_WavePrintRowWise {
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
        for(int i=0;i<m;i++){
            if(i%2==0){
                for(int j=0;j<n;j++){
                    System.out.print(grid[i][j]+(j==n-1 && i==m-1 ? ", END":", "));
                }
            }else{
                for(int j=n-1;j>=0;j--){
                    System.out.print(grid[i][j]+(j==0 && i==m-1 ? ", END":", "));
                }
            }
        }
    }
}
