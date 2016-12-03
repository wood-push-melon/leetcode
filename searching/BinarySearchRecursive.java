/*
 * Binary Search Recursive Solution
 *
 */
public class BinarySearchRecursive {
    public int binarySearch(int[] arr, int target, int lo, int hi) {
        if (lo > hi) {
            return -1;
        }

        int mid = (lo + hi) / 2;
        if (target < arr[mid]) {
            return binarySearch(arr, target, lo, mid - 1);
        } else if (target > arr[mid]) {
            return binarySearch(arr, target, mid, hi);
        } else {
            return mid;
        }
    }
}
