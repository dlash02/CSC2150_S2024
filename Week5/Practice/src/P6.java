import java.util.ArrayList;

public class P6 {
    public static void main(String[] args) {
        int[] items = new int[]{5, 23, 4, 10 };
        int n = 14;
        ArrayList<Integer> retItems = doThisMethod( items, n );
        // Map memory (AKA Trace the Variables) for the following
        //  method. Clearly show what value is returned.
    }
    private static ArrayList<Integer> doThisMethod( int[] items, int n ) {
        ArrayList<Integer> retItems = new ArrayList<>();
        for( int i=0; i< items.length; i++){
            if ( items[i] < n ){
                retItems.add( items[i]);
            }
        }
        return retItems;
    }
}
