/*
 * Binary Search
 *
 */
public class BinarySearch {
    public int binarySearch(int[] arr, int target) {
        int lo = 0;
        int hi = arr.length - 1;
        int mid;

        while (lo <= hi) {
            mid = (lo + hi) / 2;
            if (target < arr[mid]) {
                hi = mid - 1;
            } else if (target > arr[mid]) {
                lo = mid;
            } else {
                return mid;
            }
        }

        return -1;
    }
}
