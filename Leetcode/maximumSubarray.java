public class maximumSubarray {
    public static void main(String[] args) {
        maximumSubarray obj=new maximumSubarray();
        int[] nums = {-2,1}; //Example input
        System.out.println(obj.maxSubArray(nums));
    }
    // 53. Maximum Subarray
    public int maxSubArray(int[] nums) {
        int max_sum=nums[0];
        int c_sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (c_sum < 0) c_sum = 0;
            c_sum += nums[i];
            max_sum = Math.max(max_sum,c_sum);
        }
        return max_sum;
    }
}
// time: O(n)
// space: O(1)