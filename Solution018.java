/*
 * 4Sum
 * @tags: Arrays, Hash Table, Two Pointers
 *
 */

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class Solution018 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> rst = new ArrayList<List<Integer>>();

        if (nums == null || nums.length < 4) {
            return rst;
        }

        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 3; i++) {
            if (i != 0 && nums[i] == nums[i-1]) {
                continue;
            }
            for (int j = i + 1; j < nums.length - 2; j++) {
                if (j != i + 1 && nums[j] == nums[j-1]) {
                    continue;
                }

                int k = j + 1;
                int n = nums.length - 1;
                while (k < n) {
                    int sum = nums[i] + nums[j] + nums[k] + nums[n];
                    if (sum == target) {
                        List<Integer> tmp = Arrays.asList(nums[i], nums[j], nums[k], nums[n]);
                        rst.add(tmp);
                        k++;
                        n--;
                        while (k < n && nums[k] == nums[k-1]) {
                            k++;
                        }
                        while (k < n && nums[n] == nums[n+1]) {
                            n--;
                        }
                    } else if (sum < target) {
                        k++;
                    } else {
                        n--;
                    }
                }
            }
        }
        return rst;
    }
}
