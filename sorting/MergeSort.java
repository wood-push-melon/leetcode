/*
 * Merge Sort
 * it recursively divides array to two parts
 * and joins two parts back to one sorted array
 * the original array finally becomes sorted
 *
 * Space Complexity: O(n)
 * Time Comlexity: O(n*lgn)
 * Stable
 */
public class MergeSort {
    public void mergeSort(int[] arr) {
        int[] helper = new int[arr.length];
        mergeSort(arr, helper, 0, arr.length - 1);
    }

    private static void mergeSort(int[] arr, int[] helper, int lo, int hi) {
        if (lo < hi) {
            int mid = (lo + hi) / 2;
            mergeSort(arr, helper, lo, mid);
            mergeSort(arr, helper, mid + 1, hi);
            merge(arr, helper, lo, mid, hi);
        }
    }

    private static void merge(int[] arr, int[] helper, int lo, int mid, int hi) {
        // initialize helper array
        for (int i = lo; i < hi; i++) {
            helper[i] = arr[i];
        }

        int helper_left = lo;
        int helper_right = mid + 1;
        int current = lo;
        while (helper_left <= mid && helper_right <= hi) {
            if (helper[helper_left] <= helper[helper_right]) {
                arr[current] = helper[helper_left];
                helper_left++;
            } else {
                arr[current] = helper[helper_right];
                helper_right--;
            }
            current++;
        }

        // if left part remains, put remaining elements to end of array
        int remaining = mid - helper_left;
        for (int i = 0; i <= remaining; i++) {
            arr[current + i] = helper[helper_left + i];
        }
    }
}
