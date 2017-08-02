package algorithms.mergeSort;

/**
 * Created by TasdiqueC on 8/2/17.
 */
public class App {
    public static void main(String args[]){
        int[] a = new int[]{8, 9, 12, 2, 1, 3, 6, 25};
        mergeSort(a, 0, a.length-1);
        displaySortedArray(a);
    }

    private static void mergeSort(int[] a, int beginning, int end) {
        if (beginning < end) {
            int middle = (beginning+end)/2;
            mergeSort(a, beginning, middle);
            mergeSort(a, middle+1, end);
            merge(a, beginning, middle, end);
        }
    }

    private static void merge(int[] a, int beginning, int middle, int end) {
        int tempArray[] = new int [end - beginning + 1];

        int leftSlot = beginning;
        int rightSlot = middle+1;
        int k = 0;

        while (leftSlot <= middle && rightSlot <= end) {
            if (a[leftSlot] < a[rightSlot]) {
                tempArray[k] = a[leftSlot];
                leftSlot++;
            }
            else {
                tempArray[k] = a[rightSlot];
                rightSlot++;
            }
            k++;
        }

        if (leftSlot <= middle) {
            while(leftSlot <= middle) {
                tempArray[k] = a[leftSlot];
                leftSlot++;
                k++;
            }
        }
        else if (rightSlot <= end) {
            while (rightSlot <= end) {
                tempArray[k] = a[rightSlot];
                rightSlot++;
                k++;
            }
        }

        for (int i = 0; i < tempArray.length; i++) {
            a[beginning+i] = tempArray[i];
        }
    }

    private static void displaySortedArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println("{"+ i + ": " + a[i] + "}");
        }
    }
}
