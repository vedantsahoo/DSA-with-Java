package Assignment5;

import java.util.Scanner;

public class Arrays_Spiral_Print_Clockwise {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int[][] grid=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++)
                grid[i][j]=sc.nextInt();
        }
        printClockwise(grid,m,n);
    }
    public static void printClockwise(int[][] mat,int m,int n){
        int top=0, bottom=m-1;
        int left=0, right=n-1;
        int count=0;
        int total=m*n;
        while(count<total){
            //1) Right: left to right along 'top' row
            for(int i=left;i<=right && count<total;i++){
                System.out.print(mat[top][i]+", ");
                count++;
            }top++;
            //2) Down: top to bottom along 'right' column
            for(int i=top;i<=bottom && count<total;i++){
                System.out.print(mat[i][right]+", ");
                count++;
            }right--;
            //3) Left: right to left along 'bottom' row
            for(int i=right;i>=left && count<total;i--){
                System.out.print(mat[bottom][i]+", ");
                count++;
            }bottom--;
            //4) Top: bottom to top along 'left' column
            for(int i=bottom;i>=top && count<total;i--){
                System.out.print(mat[i][left]+", ");
                count++;
            }left++;
        }
        System.out.println("END");
    }
}
