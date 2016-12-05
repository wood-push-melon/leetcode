/*
 * 3Sum Closest
 * @tags: Array, Two Pointers
 *
 */

import java.util.Arrays;

public class Solution016 {
    public int threeSumClosest(int[] nums, int target) {
        if (nums == null || nums.length < 3) {
            return Integer.MAX_VALUE;
        }

        Arrays.sort(nums);
        int best = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length; i++) {
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                
                if (Math.abs(target - sum) < Math.abs(target - best)) {
                    best = sum;
                }

                if (target < sum) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        return best;
    }
}
