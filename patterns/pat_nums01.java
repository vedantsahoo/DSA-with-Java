package patterns;
public class pat_nums01 {
    public static void main(String[] args) {
        int n = 5; // Number of rows
        int i=0;
        while(i<n){
            int j=0; 
            int num=0;
            while(j<=i){
                if (num%2==0){
                    System.out.print("1");
                    num++;
                    j++;
                } else {
                    System.out.print("0");
                    num++;
                    j++;
                }
            }
            System.out.println();
            i++; 
        }
    }
}
// Output: 
// 1
// 01
// 101
// 0101
// 10101