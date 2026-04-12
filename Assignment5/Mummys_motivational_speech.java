package Assignment5;

import java.util.Scanner;

public class Mummys_motivational_speech {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] grid=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++)
                grid[i][j]=sc.nextInt();
        }
        System.out.print(isLowerTriMatrix(grid,n));
    }
    public static boolean isLowerTriMatrix(int[][]grid,int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i<j&&grid[i][j]!=0){
                    return false;
                }
            }
        }
        return true;
    }
}
