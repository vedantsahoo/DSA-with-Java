package assignment3;
import java.util.Scanner;
public class ConversionFahrenheit2Celsius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);   
        int minF=sc.nextInt();
        int maxF=sc.nextInt();
        int step=sc.nextInt();
        for (int f=minF;f<=maxF;f+=step){
            int c=5*(f-32)/9;
            System.out.println(f+"\t"+c);
        }
    }
}
