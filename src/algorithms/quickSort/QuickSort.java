package algorithms.quickSort;

/**
 * Created by TasdiqueC on 8/2/17.
 */
public class QuickSort {

    public void sort(int[] arr, int beginning, int end) {
        if (beginning < end) {
            int q = partition(arr,beginning, end);
            sort(arr, beginning, q-1);
            sort(arr, q+1, end);
        }
    }

    private int partition(int[] arr, int beginning, int end) {
        int x = arr[end];
        int i = beginning-1;
        for (int j = beginning; j < end; j++) {
            if(arr[j] <= x) {
                i++;
                swap(arr, j, i);
            }
        }
        i++;
        swap(arr, i, end);
        return i; // returns the value at which everything is sorted
    }

    private void swap(int[] arr, int var1, int var2){
        int temp = arr[var1];
        arr[var1] = arr[var2];
        arr[var2] = temp;
    }
}
