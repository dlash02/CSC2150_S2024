package Prep;

public class Sort3Digits {
    public static void main(String[] args) {
        int[] digits3 = { 0, 1, 1, 2, 0, 2, 0, 1, 0, 2, };
        int[] sorted = sort123( digits3 );
        showList( sorted );
    }

    private static void showList(int[] sorted) {
        int ct = 0;
        for ( int item : sorted ) {
            System.out.printf("\n ct:%s item:%s", ct++, item);
        }
    }

    private static int[] sort123(int[] digits3) {
        int[] countDigits = new int[3];
        int[] retList = new int[digits3.length];
        for( int digit : digits3 ){
            countDigits[digit] += 1;
        }
        //countDIgits[0] = 4;
        //countDigits[1] = 3;
        //countDigits[2] = 3;
        int retCt = 0;
        for( int i = 0; i<countDigits.length; i++){
            int numToAdd = countDigits[i];
            int digit = i;
            for( int j=0; j<numToAdd; j++){
                retList[retCt++] = digit;
            }
        }
        return retList;
    }
}
