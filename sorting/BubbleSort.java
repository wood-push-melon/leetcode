/*
 * Bubble Sort
 * 0 to i is the unsorted zone
 * i to (size-1) is the sorted zone
 *
 * O(n^2) worst case
 */
public class BubbleSort {
    public void bubbleSort(int[] arr, int size) {
        boolean flag = false;

        for (int i = size - 1; i > 0; i--) {
            flag = false;
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j+1]) {
                    swap(arr, j, j+1);
                    flag = true;
                }
            }

            if (!flag) {
                break;
            }
        }
    }

    private static void swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}
