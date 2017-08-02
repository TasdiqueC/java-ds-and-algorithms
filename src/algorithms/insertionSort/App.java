package algorithms.insertionSort;

/**
 * Created by TasdiqueC on 8/2/17.
 */
public class App {
    public static void main(String args[]){
        int[] a = new int[]{8, 9, 12, 2, 1, 3, 6, 25};
        insertionSort(a);
        displaySortedArray(a);
    }

    public static int[] insertionSort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int element = a[i];
            int j = i-1;
            while (j >= 0 && a[j] > element) {
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = element;
        }
        return a;
    }

    public static void displaySortedArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println("{"+ i + ": " + a[i] + "}");
        }
    }
}
