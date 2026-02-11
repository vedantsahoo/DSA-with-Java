package patterns;

public class HalfDiamond {
    public static void main(String[] args) {
        int n = 9;
        int i=0;
        while(i<n){
            if(i<n/2){
                int j=0;
                while(j<=i){
                    System.out.print("*");
                    j++;
                }
            }
            else{
                int j=0;
                while(j<n-i){
                    System.out.print("*");
                    j++;
                }
            }
            System.out.println();
            i++;
        }
    }
}

// Output:
// *
// **
// ***
// ****
// *****
// ****
// ***
// **
// *