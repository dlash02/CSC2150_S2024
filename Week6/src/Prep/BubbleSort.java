package Prep;

public class BubbleSort {
    public static void main(String[] args) {

        int arr[] = { 64, 55, 12, 66, 91, 21, 121, 12, 33};
        int sLis[] = bubbleSort( arr );
        System.out.printf("\n Results are .... ");
        for ( int item : sLis) {
            System.out.printf("\n Item:%s", item);
        }
    }

    private static int[] bubbleSort(int[] arr) {
        // arr = { 5, 2, 9, 1 }
        // n = 4     i = 0   j = 0   (5 < 2 )  { 2, 5, 9, 1 }
        // inner loop j = 1 ( 5 > 9) ?
        // inner loop j = 2 ( 9 > 1 ) ? { 2, 5, 1, 9 }
        // inner loop j = 3 -- inner loop done
        // i=1 (outer) j=0; (inner) ( 2 > 5) No { 2, 5, 1, 9 }
        //        Inner j=1; (5 > 1 )??? Yes { 2, 1, 5, 9 }
        // innert j=2 4(n)-1(i) -1
        int n = arr.length;
        for (int i=0; i<n-1; i++ ){
            // grab the left most item and move compare it.
            for (int j=0; j<n-i-1; j++ ){
                if ( arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
}
