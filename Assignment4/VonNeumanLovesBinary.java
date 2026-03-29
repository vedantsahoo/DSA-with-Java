package Assignment4;

import java.util.Scanner;

public class VonNeumanLovesBinary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            String binary=sc.next();
            int decimalVal=Integer.parseInt(binary,2);
            System.out.println(decimalVal);
        }
    }
}
