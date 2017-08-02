package algorithms.linear_search;

/**
 * Created by TasdiqueC on 8/1/17.
 */
public class App {
    public static void main(String args[]) {
        int[] a = {4, 5, 2, 10, 90, 19};
        int x = 40;
        LinearSearch linearSearch = new LinearSearch(a, x);
        System.out.println(linearSearch.getIndex());
    }
}
