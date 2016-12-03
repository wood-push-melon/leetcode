/*
 * Insertion Sort
 * 0 to (i-1) is relatively sorted zone
 * i to (size-1) is unsorted zone
 * it selects i and inserts it into relatively sorted zone
 *
 * O(n^2) worst case
 * O(n) when array nearly sorted
 */
public class InsertionSort {
    public void insertionSort(int[] arr, int size) {
        for (int i = 1; i < size; i++) {
            int j = i;
            int candidate = arr[i];
            while (j >= 0 && arr[j-1] < candidate) {
                arr[j] = arr[j-1]; // shift right
                j--;
            }
            arr[j] = candidate;
        }
    }
}
