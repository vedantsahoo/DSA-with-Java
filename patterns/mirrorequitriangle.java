package patterns;
public class mirrorequitriangle {
    public static void main(String[] args) {
        int n = 5; // Number of rows for the upper half
        int row = 0; // Row counter
        // Upper half of the diamond
        while (row < n) {
            int col = 0; // Column counter
            // Print leading spaces
            while (col < n - row) {
                System.out.print(" ");
                col++;
            }
            col = 0; // Reset column counter for stars
            // Print stars
            while (col < 2 * row + 1) {
                System.out.print("*");
                col++;
            }
            // Move to the next line after each row
            System.out.println();
            row++;
        }
        row = n-1; // Start from the second last row for the lower half
        // Lower half of the diamond
        while (row >= 0) {
            int col = 0; // Column counter
            // Print leading spaces
            while (col < n - row) {
                System.out.print(" ");
                col++;
            }
            col = 0; // Reset column counter for stars
            // Print stars
            while (col < 2 * row + 1) {
                System.out.print("*");
                col++;
            }
            // Move to the next line after each row
            System.out.println();
            row--;
        }
    }
}
// Output:
//     *
//    ***
//   *****
//  *******
// *********
// *********
//  *******
//   *****
//    ***
//     *