class Spiral_II {
    public int[][] generateMatrix(int n) {
        int [][]mat=new int[n][n];
        int top=0; int bottom=n-1;
        int left=0; int right=n-1;
        int count=0;
        int total=n*n;
        while(count<total){
            //1) Right: left to right along 'top' row
            for(int i=left;i<=right && count<total;i++){
                mat[top][i]=count+1;
                count++;
            }top++;
            //2) Down: top to bottom along 'right' column
            for(int i=top;i<=bottom && count<total;i++){
                mat[i][right]=count+1;
                count++;
            }right--;
            //3) Left: right to left along 'bottom' row
            for(int i=right;i>=left && count<total;i--){
                mat[bottom][i]=count+1;
                count++;
            }bottom--;
            //4) Top: bottom to top along 'left' column
            for(int i=bottom;i>=top && count<total;i--){
                mat[i][left]=count+1;
                count++;
            }left++;
        }
        return mat;
    }
}
