package SortWork;

public class SortManager {
    int[] inList;

    public SortManager(int[] inList2) {
        inList = inList2;
    }
    public int[] bubbleSort() {
        int n = this.inList.length;
        for (int i=0; i<n-1; i++ ){
            // grab the left most item and move compare it.
            for (int j=0; j<n-i-1; j++ ){
                if ( inList[j] > inList[j+1]) {
                    int temp = inList[j];
                    inList[j] = inList[j+1];
                    inList[j+1] = temp;
                }
            }
        }
        return inList;
    }
    void insertionsort() {
        int n = inList.length;

        for (int i = 1; i < n; ++i) {
            int key = inList[i];
            int r = i - 1;
            /* Move elements of inList[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (r >= 0 && inList[r] > key) {
                inList[r + 1] = inList[r];
                r = r - 1;
            }
            inList[r + 1] = key;
        }
    }
}
