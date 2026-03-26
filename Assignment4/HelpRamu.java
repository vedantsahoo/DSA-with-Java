package Assignment4;

import java.io.*;
import java.util.*;
public class HelpRamu {
    // public static void main(String[] args) {
    //     Scanner sc=new Scanner(System.in);
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;
        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    String line = br.readLine();
                    if (line == null) return null;
                    st = new StringTokenizer(line);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt() {
            return Integer.parseInt(next());
        }
    }
    public static void main(String[] args) {
        FastReader sc = new FastReader();
        int t=sc.nextInt();
        while (t-- > 0) {
            // Read ticket costs
            long c1 = sc.nextInt();
            long c2 = sc.nextInt();
            long c3 = sc.nextInt();
            long c4 = sc.nextInt();

            // Read number of vehicles
            int n = sc.nextInt();
            int m = sc.nextInt();

            // Calculate optimal cost for Rickshaws
            long rickshawCostSum = 0;
            for (int i = 0; i < n; i++) {
                long rides = sc.nextInt();
                rickshawCostSum += Math.min(rides * c1, c2);
            }
            long optimalRickshawCost = Math.min(rickshawCostSum, c3);

            // Calculate optimal cost for Cabs
            long cabCostSum = 0;
            for (int i = 0; i < m; i++) {
                long rides = sc.nextInt();
                cabCostSum += Math.min(rides * c1, c2);
            }
            long optimalCabCost = Math.min(cabCostSum, c3);

            // Calculate final optimal cost
            long finalMinimumCost = Math.min(optimalRickshawCost + optimalCabCost, c4);

            System.out.println(finalMinimumCost);
        }
    }
}
