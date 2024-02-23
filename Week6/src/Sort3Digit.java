public class Sort3Digit {
    private int[] inList;

    public Sort3Digit(int[] blah) {
        this.inList = blah;
    }
    public int[] sort3Digits( ){
        int[] counterList = new int[3];
        for( int i=0; i<this.inList.length; i++){
            int item = inList[i];
            counterList[item]++;
        }
        int[] retList = new int[inList.length];
        int retCt = 0;
        for( int i=0; i< counterList.length; i++){
            int nTimes = counterList[i];
            for( int j=0; j<nTimes; j++){ // e.g., how many 0's to create
                retList[retCt++] = i;
            }

        }
        return retList;
    }

    public int[] sort5Digits( int uniqDigits) {
        int[] counterList = new int[uniqDigits];
        for( int i=0; i<this.inList.length; i++){
            int item = inList[i];
            counterList[item]++;
        }
        int[] retList = new int[inList.length];
        int retCt = 0;
        for( int i=0; i< counterList.length; i++){
            int nTimes = counterList[i];
            for( int j=0; j<nTimes; j++){ // e.g., how many 0's to create
                retList[retCt++] = i;
            }

        }
        return retList;
    }
}
