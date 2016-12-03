/*
 * Two Sum
 * @tags: array, hashtable
 */

import java.util.HashMap;

public class Solution001 {
    private HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])) {
                return new int[] {map.get(nums[i]), i};
            }
            map.put(target - nums[i], i);
        }
        return new int[0];
    }
}
