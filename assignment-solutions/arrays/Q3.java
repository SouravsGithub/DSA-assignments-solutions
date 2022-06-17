//https://leetcode.com/problems/running-sum-of-1d-array/

import java.util.Arrays;

public class Q3 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] ans = runningSum(nums);
        System.out.println(Arrays.toString(ans));
    }

    static int[] runningSum(int[] nums) {
        int len = nums.length;
        int[] runningSum = new int[len];
        int sum = 0;
        for (int i = 0; i < runningSum.length; i++) {
            sum = sum + nums[i];
            runningSum[i] = sum;
        }
        return runningSum;
    }
}
