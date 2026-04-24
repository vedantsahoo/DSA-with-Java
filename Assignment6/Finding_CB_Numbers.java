package Assignment6;

import java.util.*;
public class Finding_CB_Numbers{
    public static boolean isCBNumber(long n) {
        //Check if a number is a CB Number
        if (n == 0 || n == 1) return false;
        int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29};
        // Rule 2: If it's exactly one of the primes, it is a CB number
        for (int i = 0; i < primes.length; i++) {
            if (n == primes[i]) {
                return true;
            }
        }
        // Rule 3: If it's divisible by any of the primes, it's not a CB number
        for (int i = 0; i < primes.length; i++) {
            if (n % primes[i] == 0) return false;
        }
        return true;
    }
    public static boolean isValid(boolean[] visited, int start, int end) {
        for (int i = start; i < end; i++) {
            if (visited[i]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = scanner.next();
        int count = 0;
        boolean[] visited = new boolean[n];
        for (int len = 1; len <= n; len++) {
            for (int i = 0; i <= n - len; i++) {
                int j = i + len;
                String sub = s.substring(i, j);
                long num = Long.parseLong(sub);
                if (isCBNumber(num) && isValid(visited, i, j)) {
                    count++;
                    for (int k = i; k < j; k++) {
                        visited[k] = true;
                    }
                }
            }
        }
        System.out.println(count);
    }
}