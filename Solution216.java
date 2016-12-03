/*
 * Combination Sum III
 * @tags: array, backtracking(DFS)
 */

import java.util.List;
import java.util.ArrayList;

public class Solution216 {
    private List<List<Integer>> result = new ArrayList<List<Integer>>();
    private List<Integer> path = new ArrayList<Integer>();

    public List<List<Integer>> combinationSum3(int k, int n) {
        if (k < 0 || k > 10) {
            return result;
        }

        if (n < 0 || n > 45) {
            return result;
        }

        helper(1, k, n);
        return result;
    }

    private void helper(int index, int k, int n) {
        if (n < 0 || k < 0) {
            return;
        }
        else if (n == 0 && k == 0) {
            result.add(new ArrayList<Integer>(path));
        }
        else {
            for (int i = index; i < 10; i++) {
                path.add(i);
                helper(i + 1, k - 1, n - i);
                path.remove(path.size() - 1);
            }
        }
    }
}
