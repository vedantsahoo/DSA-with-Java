public class reverseBits {
    public static void main(String[] args) {
        int n = 43261596; // Example input
        reverseBits solution = new reverseBits();
        int result = solution.reverseBits(n);
        System.out.println("Reversed bits: " + result);
    }
    // 190. Reverse Bits
    public int reverseBits(int n) {
        // you need treat n as an unsigned value
        int ans = 0;
        for (int i = 0; i < 32 && n != 0; ++i) {
            // 1. Get the last bit of n: (n & 1)
            // 2. Move that bit to its reversed position: << (31 - i)
            // 3. Merge it into the answer using OR: |=
            ans |= (n & 1) << (31 - i);
            // 4. Logical right shift n to process the next bit
            n >>>= 1;
        }
        return ans;
    }
}
// time: O(1)
// space: O(1)