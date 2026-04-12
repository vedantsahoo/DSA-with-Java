package Assignment5;

import java.util.Scanner;

public class Rotate_Image_2Darray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][]grid=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                grid[i][j]=sc.nextInt();
            }
        }
        int[][] rotated=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                rotated[n-1-j][i]=grid[i][j];
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(rotated[i][j]+" ");
            }
            System.out.println();
        }
    }
}
