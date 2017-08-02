package algorithms.linear_search;

/**
 * Created by TasdiqueC on 8/1/17.
 */
public class LinearSearch {
    private int[] a;
    private int x;
    private int index;

    public LinearSearch(int[] a, int x) {
        this.a = a;
        this.x = x;
        this.index = theSearch();
    }

    public int theSearch() {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public int getIndex() {
        return index;
    }
}
