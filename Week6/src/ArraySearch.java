public class ArraySearch {
    private int inList[];

    public ArraySearch(int[] inList) {
        this.inList = inList;
    }

    public int linearSearch(int searchToken) {
        for ( int i=0; i<inList.length; i++){
            if ( inList[i] == searchToken){
                return i;
            }
        }
        return -1;
    }

    public int binarySearch(int searchToken) {
        int start = 0;
        int last = inList.length-1;
        while ( start <= last ){
            int mid = ( start + last ) / 2;
            if ( inList[mid] == searchToken){
                return mid;
            } else  if (inList[mid] > searchToken){
                last = mid -1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
