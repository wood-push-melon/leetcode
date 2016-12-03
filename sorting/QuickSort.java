/*
 * Quick Sort
 * it recursively divides array to two parts based on a pivot
 * make sure all elements in left part less than the pivot
 * all elements in right part greater than the pivot
 * all elements in left part less than the pivot
 * the original array finally becomes sorted
 *
 * O(n*lgn)
 * not stable
 */
public class QuickSort {
    public void quickSort(int[] arr, int start, int end) {
        int p = partition(arr, start, end);
        if (start < p - 1) {
            quickSort(arr, start, p - 1);
        }
        if (end > p) {
            quickSort(arr, p, end);
        }
    }

    private static int partition(int[] arr, int start, int end) {
        int pivot = arr[(start + end) / 2];
        while (start < end) {
            while (arr[start] <= pivot) {
                start++;
            }
            while (arr[end] >= pivot) {
                end--;
            }

            if (start < end) {
                swap(arr, start, end);
                start++;
                end--;
            }
        }

        return start;
    }

    private static void swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}
