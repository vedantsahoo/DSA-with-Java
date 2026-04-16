package Assignment5;

import java.util.Scanner;

public class Column_with_maximum_sum_in_a_Matrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [][] mat=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++)
                mat[i][j]=sc.nextInt();
        }
        findMaxColumn(mat, n);
    }
    public static void findMaxColumn(int[][]mat,int n){
        long maxSum=Long.MIN_VALUE;
        int maxColIndex=-1;
        for(int i=0;i<n;i++){
            long currentColSum=0;
            for(int j=0;j<n;j++){
                currentColSum+=mat[j][i];
            }
            if(currentColSum>maxSum){
                maxSum=currentColSum;
                maxColIndex=i;
            }
        }
        System.out.println((maxColIndex+1) +" "+ maxSum);
    }
}
