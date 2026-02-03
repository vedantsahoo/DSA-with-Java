package patterns;
public class revLeftpiramid {
        public static void main(String[] args) {
        int n = 5;
        int row = 0;
        while (row<n) {
            int col = 0;
            while (col<n-row){
                System.out.print("*");
                col++;
            }
            System.out.println("");
            row++;
        }
    }
}
// Output:
// *****
// ****
// ***
// **
// *