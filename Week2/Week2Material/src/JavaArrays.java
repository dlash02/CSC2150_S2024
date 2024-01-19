public class JavaArrays {
    public static void main(String[] args) {
        int[] myList = new int[5];
        myList[0] = 12;
        myList[1] = 222;
        myList[2] = 312;
//        if ( m)
        System.out.printf("Number 1=%s", myList[1]);
        for( int i=0; i<myList.length; i++){
            System.out.printf("\n I:%s Item:%s", i, myList[i]);
        }
        int largest = getLargest( myList);
        System.out.printf("\n Largest:%s", largest);
        int tok = 12;
//        Booleen gotIt = gotThisNumber( tok, myList );
//        if ( gotIt )
        if ( gotThisNumber( tok, myList )) {
            System.out.printf("\n Yes we got :%s", tok);
        }else {
            System.out.printf("\n No got :%s", tok);
        }

        String[] myNames = new String[5];
        myNames[0] = "Jack";
    }

    private static boolean gotThisNumber(int tok, int[] myList) {
        boolean gotIt = false;
        for( int i=0; i<myList.length; i++) {
            if ( tok == myList[i]){
                gotIt = true;
                break;
            }
        }
        return gotIt;
    }

    private static int getLargest(int[] myList) {
        int largest = Integer.MIN_VALUE;
        for( int i=0; i<myList.length; i++) {
            if ( largest < myList[i]){
                largest = myList[i];
            }
        }
        return largest;
    }
}
