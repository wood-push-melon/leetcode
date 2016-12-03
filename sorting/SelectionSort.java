/*
 * Selection Sort
 * 0 to i is sorted zone
 * (i+1) to (size-1) is unsorted zone
 * it selects a mininum within inner loop each time
 * and swap it with i
 *
 * O(n^2) worst case
 * less swaps
 */
public class SelectionSort {
    public void selectionSort(int[] arr, int size) {
        for (int i = 0; i < size; i++) {
            int min = i;
            for (int j = i+1; j < size; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            
            if (min != i) {
                swap(arr, min, i);
            }
        }
    }

    private static void swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}
