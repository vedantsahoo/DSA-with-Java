package Assignment5;

import java.util.Scanner;

public class A_Boolean_Matrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int[][]grid =new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++)
                grid[i][j]=sc.nextInt();
        }
        int[][] res=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    for(int k=0;k<n;k++){
                        res[i][k]=1;
                    }
                    for(int k=0;k<m;k++){
                        res[k][j]=1;
                    }
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++)
                System.out.print(res[i][j]+" ");
            System.out.println();
        }
    }
}
