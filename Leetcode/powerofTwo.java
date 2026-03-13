public class powerofTwo {
    public static void main(String[] args) {
        powerofTwo obj=new powerofTwo();
        int n=16; //Example input
        System.out.println(obj.isPowerOfTwo(n));
    }
    // 231. Power of Two
    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }
}
// time: O(1)
// space: O(1)
