//https://leetcode.com/problems/shuffle-the-array/

import java.util.Arrays;

public class Q5 {
    public static void main(String[] args) {
        int[] nums = {2, 5, 1, 3, 4, 7};
        int n = 3;
        int[] ans = shuffle(nums, n);
        System.out.println(Arrays.toString(ans));
    }

    static int[] shuffle(int[] nums, int n) {
        int len = nums.length;
        int[] ans = new int[len];
        int count = 0;
        for (int i = 0; i < len; i += 2) {
            ans[i] = nums[count];
            ans[i + 1] = nums[count + n];
            count++;
        }
        return ans;
    }
}
