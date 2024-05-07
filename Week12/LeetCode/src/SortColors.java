import java.util.TreeMap;

public class SortColors {
    public static void main(String[] args) {
        int[] inList = new int[]{ 2, 2, 0, 1};
        sortColors( inList );
        for( int item : inList){
            System.out.printf("\nItem:%s", item);
        }
    }
    public static void sortColors( int[] nums){
        TreeMap<Integer, Integer> sortNumbs = new TreeMap<>();
        for( int num : nums){
            if ( sortNumbs.containsKey(num)){
                sortNumbs.put( num, sortNumbs.get(num) + 1 );
            } else {
                sortNumbs.put( num, 1);
            }
        }
        int indx = 0;
        for( int key : sortNumbs.keySet() ){
            for ( int i=0; i<sortNumbs.get(key); i++){
                nums[indx++] = key;
            }
        }
    }
}
