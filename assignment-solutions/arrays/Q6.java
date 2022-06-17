//https://leetcode.com/problems/number-of-good-pairs/

public class Q6 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1, 1, 3};
        int ans = numIdenticalPairs(nums);
        System.out.println(ans);
    }

    static int numIdenticalPairs(int[] nums) {
        int ans = 0;
        int i = 0;
        while (i < nums.length) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j] && i < j) {
                    ans++;
                }
            }
            i++;
        }

        return ans;
    }
}
