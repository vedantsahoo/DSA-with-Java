import java.util.Scanner;
public class DayName{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        String D ="";
        switch(day){
            case 1:D="Monday"; break;
            case 2:D="Tuesday"; break;
            case 3:D="Wednesday"; break;
            case 4:D="Thursday"; break;
            case 5:D="Friday"; break;
            case 6:D="Saturday"; break;
            case 7:D="Sunday"; break;
        }
        System.out.println(D);
        sc.close();
    }
}