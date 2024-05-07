import java.util.TreeMap;

public class SortColorsv2 {
    public static void main(String[] args) {
        int[] inList = new int[]{ 2, 2, 0, 1};
        sortColors( inList );
        for( int item : inList){
            System.out.printf("\nItem:%s", item);
        }
    }
    public static void sortColors( int[] nums){
            int[] buckets = new int[3];
            for( int num : nums){
                buckets[num]++;
            }
            int ctr = 0;
            for( int i=0; i<buckets.length; i++){
                if ( buckets[i] != 0){
                    for( int j=0; j<buckets[i]; j++){
                        nums[ctr++] = i;
                    }
                }
            }
    }
}
