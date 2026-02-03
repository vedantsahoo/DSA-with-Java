public class piramid {
        public static void main(String[] args) {
        int n=5;
        int row=0;
        while (row<n) {
            System.out.print(" ".repeat(n-row));
            /*
            int col=0;
            while (col<row){
                Systen.out.print(" ");
                col++;
            }
            */
            int col=0;
            while (col<=row){
                System.out.print("* ");
                col++;
            }
            System.out.println();
            row++;
        }
    }
}
