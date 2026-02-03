package patterns;
public class equilateraltriangle {
    public static void main(String[] args) {
        int n=4;
        int row=0;
        while (row<n) {
            // System.out.print(" ".repeat(n-row));
            int col=0;
            while(col<n-row){
                System.out.print(" ");
                col++;
            }
            col=0;
            while(col<2*row+1){
                System.out.print("*");
                col++;
            }
            System.out.println();
            row++;
        }
    }
}
// Output:
//    *
//   ***
//  *****
// *******
