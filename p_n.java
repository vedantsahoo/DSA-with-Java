import java.util.Scanner;
public class p_n {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        if (num>0) System.out.println("Positive");
        else if (num<0) System.out.println("Negative");
        else System.out.println("Zero");
        sc.close();
    }
}