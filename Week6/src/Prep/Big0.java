package Prep;

public class Big0   {
    public static void main(String[] args) {
        int[] myList = { 5, 7, 9 , 10, 12};
        int tok = 9;
        int ret = mySearch( myList, tok );
    }

    private static int mySearch(int[] myList, int tok) {
        int ret = -1;
        int ct = 0;
        for( int item : myList){
            if ( tok == item ){
                return ct;
            }
            ct++;
        }
        return  ret;
    }
    private static int myMethod1( int nTimes) {
        int ret = -1;
        int ct = 0;
        for( int i=0; i<nTimes; i++){
            if ( i > 1000000) return -1;
            ct += i;
        }
        return  ct;
    }
}
