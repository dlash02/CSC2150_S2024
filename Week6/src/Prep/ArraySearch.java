package Prep;

public class ArraySearch {
        private int inList[];

    public ArraySearch(int[] myList) {
        this.inList = myList;
    }
    int linearSearch( int needle ){
        int ret = -1;
        int pos = 0;
        for( int item : inList ){
            if ( item == needle ){
                ret = pos;
                break;
            }
            pos++;
        }
        return ret;
    }
    int binarySearch(  int needle) {
            int start = 0;
            int last = inList.length-1;
            while (start <= last) {
                int mid = (start + last) / 2;
                if (inList[mid] == needle) {
                    // Found it at middle, return position
                    return mid;
                } else if (inList[mid] > needle) {
                    // If element is smaller than mid, then
                    //  - Goto left and last is  mid - 1
                    last = mid - 1;

                } else {
                    // Go to right subArray
                    //       start is at  mid + 1
                    start = mid + 1;
                }
            }
            // End of array
            return -1;
        }
}
