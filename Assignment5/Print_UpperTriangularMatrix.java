package Assignment5;

import java.util.Scanner;

public class Print_UpperTriangularMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] mat=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++)
                mat[i][j]=sc.nextInt();
        }
        int[][]upper=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i>j) upper[i][j]=0;
                else upper[i][j]=mat[i][j];
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++)
                System.out.print(upper[i][j]+" ");
            System.out.println();
        }
    }
}