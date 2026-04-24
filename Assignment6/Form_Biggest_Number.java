package Assignment6;
import java.util.*;

public class Form_Biggest_Number {
    public static void printLargest(Integer[] arr){
        Arrays.sort(arr,
            (a,b)->{
                String ab=a+""+b;
                String ba=b+""+a;
                return ba.compareTo(ab);
            }
        );
        StringBuilder sb = new StringBuilder();
        for (Integer s : arr) {
            sb.append(s);
        }
        System.out.println(sb.toString());
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            Integer [] arr=new Integer[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            printLargest(arr);
        }
        sc.close();
    }
}
