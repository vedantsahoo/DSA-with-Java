package assignment3;

import java.util.Scanner;
public class Conversion_AnyToAny {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Reading input based on the specified format
        if (sc.hasNextInt()) {
            int sb = sc.nextInt(); // Source Base
            int db = sc.nextInt(); // Destination Base
            int sn = sc.nextInt(); // Source Number
            System.out.println(convertBase(sb, db, sn));
        }
        sc.close();
    }
    public static long convertBase(int sb, int db, int sn) {
        // Step 1: Convert sn (base sb) to Decimal (base 10)
        long decimalValue = 0;
        long power = 1; // Represents sb^0, sb^1, etc.
        while (sn > 0) {
            int digit = sn % 10;
            decimalValue += (long) digit * power;
            power *= sb;
            sn /= 10;
        }
        // Step 2: Convert Decimal to Destination (base db)
        if (decimalValue == 0) return 0;
        long result = 0;
        long multiplier = 1; // Represents 10^0, 10^1, etc. for the output format
        while (decimalValue > 0) {
            long remainder = decimalValue % db;
            result += remainder * multiplier;
            decimalValue /= db;
            multiplier *= 10;
        }
        return result;
    }
}
