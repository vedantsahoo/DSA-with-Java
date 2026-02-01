import java.util.Scanner;
public class monthName{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        String D ="";
        switch(month){
           case 1:D="January"; break;
           case 2:D="February"; break;
           case 3:D="March"; break;
           case 4:D="April"; break;
           case 5:D="May"; break;
           case 6:D="June"; break;
           case 7:D="July"; break;
           case 8:D="August"; break;
           case 9:D="September"; break;
           case 10:D="October"; break;
           case 11:D="November"; break;
           case 12:D="December"; break;
        }
        System.out.println(D);
        sc.close();
    }
}

