package patterns;
public class rightpiramid {
    public static void main(String[] args) {
        int n=5;
        int row=0;
        while (row<n) {
            // System.out.print(" ".repeat(n-row));
            int col=0;
            while (col<n-row){
                System.out.print(" ");
                col++;
            }
            col=0;
            while (col<=row){
                System.out.print("*");
                col++;
            }
            System.out.println();
            row++;
        }
    }
}
// Output:
//     *
//    **
//   ***
//  ****
// *****