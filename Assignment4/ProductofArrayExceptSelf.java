package Assignment4;
import java.util.*;
public class ProductofArrayExceptSelf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }
        long[] result = getProductExceptSelf(arr, n);
        // Print the output
        for (int i = 0; i < n; i++) {
            System.out.print(result[i]+(i == n - 1 ? "" : " "));
        }
    }
    public static long[] getProductExceptSelf(long[] arr, int n) {
        long[] output = new long[n];
        output[0] = 1;
        for (int i = 1; i < n; i++) {
            output[i] = output[i - 1] * arr[i - 1];
        }
        long suffix = 1;
        for (int i = n - 1; i >= 0; i--) {
            output[i] = output[i] * suffix;
            suffix *= arr[i];
        }
        return output;
    }
}
