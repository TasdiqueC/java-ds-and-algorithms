package algorithms.quickSort;

/**
 * Created by TasdiqueC on 8/2/17.
 */
public class App {
    public static void main(String args[]){
        int[] a = new int[]{8, 9, 12, 2, 1, 3, 6, 25};
        QuickSort quickSort = new QuickSort();
        quickSort.sort(a, 0, a.length-1);
        displaySortedArray(a);
    }

    private static void displaySortedArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println("{"+ i + ": " + a[i] + "}");
        }
    }
}
