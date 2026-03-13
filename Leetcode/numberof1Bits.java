public class numberof1Bits {
    public static void main(String[] args) {
        numberof1Bits obj=new numberof1Bits();
        int n=2147483645;
        System.out.println(obj.hammingWeight(n));
    }
    // 191. Number of 1 Bits
    public int hammingWeight(int n) {
        int count=1;
        while(n!=1){
            count=count+((n%2==1)?1:0);
            n=n/2;
        }
        return count;
    }
}
// time: O(log n)
// space: O(1)