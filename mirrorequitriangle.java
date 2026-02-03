public class mirrorequitriangle {
    public static void main(String[] args) {
        int n = 5; // Number of rows for the upper half
        int i = 0; // Row counter
        // Upper half of the diamond
        while (i < n) {
            int j = 0; // Column counter
            // Print leading spaces
            while (j < n - i - 1) {
                System.out.print(" ");
                j++;
            }
            j = 0; // Reset column counter for stars
            // Print stars
            while (j < 2 * i + 1) {
                System.out.print("*");
                j++;
            }
            // Move to the next line after each row
            System.out.println();
            i++;
        }
        i = n - 1; // Start from the second last row for the lower half
        // Lower half of the diamond
        while (i >= 0) {
            int j = 0; // Column counter
            // Print leading spaces
            while (j < n - i - 1) {
                System.out.print(" ");
                j++;
            }
            j = 0; // Reset column counter for stars
            // Print stars
            while (j < 2 * i + 1) {
                System.out.print("*");
                j++;
            }
            // Move to the next line after each row
            System.out.println();
            i--;
        }
    }
}
