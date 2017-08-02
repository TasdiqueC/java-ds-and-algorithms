package algorithms.binary_search;

/**
 * Created by TasdiqueC on 8/1/17.
 */
public class App {
    public static void main(String[] args) {
        int a[] = {0, 2, 4, 6, 8, 10, 12};
        int x = 18;
        System.out.println(binarySearch(a, x));
    }


    // Non-recursive
    public static int binarySearch(int[] a, int x) {
        int beginning = 0;
        int end = a.length-1;

        while (beginning <= end) {
            int middle = (beginning+end)/2;
            if(x < a[middle]) end = middle-1;
            else if (x > a[middle]) end = middle+1;
            else return middle;
        }
        return -1;
    }

//    // Recursive method
//    public static int binarySearch(int a[], int x){
//        int beginning = 0;
//        int end = a.length-1;
//        int middle = (beginning + end) / 2;
//        if (a[middle] == x) {return middle;}
//        if (beginning != end) {
//            if (a[middle] < x) {
//                beginning = middle + 1;
//                return binarySearch(a, x, beginning, end);
//            } else if (a[middle] > x) {
//                end = middle;
//                return binarySearch(a, x, beginning, end);
//            }
//        }
//        return -1;
//    }
//
//    public static int binarySearch(int a[], int x, int beginning, int end){
//        int middle = (beginning + end) / 2;
//        if (a[middle] == x) {return middle;}
//        if (beginning != end) {
//            if (a[middle] < x) {
//                beginning = middle + 1;
//                return binarySearch(a, x, beginning, end);
//            } else if (a[middle] > x) {
//                end = middle;
//                return binarySearch(a, x, beginning, end);
//            }
//        }
//        return -1;
//    }
}
