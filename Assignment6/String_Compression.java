package Assignment6;
import java.util.*;
public class String_Compression {
    public static String compressString(String s) {
        StringBuilder sb = new StringBuilder();
        int count = 1;
        char currentChar = s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == currentChar) {
                count++;
            } else {
                sb.append(currentChar).append(count);
                currentChar = s.charAt(i);
                count = 1;
            }
        }
        sb.append(currentChar).append(count);
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(compressString(s));
        sc.close();
    }
}
