package patterns;
public class numpat_1 {
    public static void main(String[] args) {
        int n=4; // Number of rows
        int i=0; // Row counter
        while(i<n){
            int j = 0;// Column counter
            // Print numbers in each row
            while(j<i+1){
                // Print the number (j+1)
                System.out.print(j+1);
                j++;
            }
            // Move to the next line after each row
            System.out.println();
            i++;
        }
    }
}
