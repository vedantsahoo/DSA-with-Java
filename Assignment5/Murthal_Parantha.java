package Assignment5;
import java.util.*;
public class Murthal_Parantha {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int P=sc.nextInt();
        int L=sc.nextInt();
        int[] ranks =new int[L];
        for(int i=0;i<L;i++)
            ranks[i]=sc.nextInt();
        System.out.println(minTime(P,ranks));
    }
    public static int minTime(int p, int[] ranks) {
        int low = 0;
        int high = 100000000;// 10^8 is a safe upper bound
        int ans = high;
        while (low <= high){
            int mid=low+(high-low)/2;
            if (isPossible(p,ranks,mid)) {
                ans = mid;
                high = mid-1;// Try to find a smaller time
            }else {
                low=mid+1;// Need more time
            }
        }
        return ans;
    }
    private static boolean isPossible(int p, int[] ranks, int timeLimit) {
        int totalParanthas = 0;
        for (int rank : ranks) {
            int count = 0;
            int timeSpent = 0;
            int nextParanthaTime = rank;
            // Calculate how many paranthas this specific cook can make in timeLimit
            while(timeSpent + nextParanthaTime <= timeLimit){
                timeSpent += nextParanthaTime;
                count++;
                nextParanthaTime = rank*(count+1);
            }
            totalParanthas += count;
            if (totalParanthas >= p) return true;
        }
        return totalParanthas >= p;
    }
}
