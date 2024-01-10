public class StringVSStringBuilder {

    public static void main(String[] args) {
        String s1 = "S1";
        long start1 = System.currentTimeMillis();
        int nTimes = 10000;
        appendToString( s1, nTimes);
        long end1 = System.currentTimeMillis();
        System.out.printf("\n S1 done Time in MS:%s", end1-start1 );

        long start2 = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder("S2");
        appendToStringBuilder( sb, nTimes);
        long end2 = System.currentTimeMillis();
        System.out.printf("\n --- S2 done Time in MS:%s", end2-start2 );
    }
    private static void appendToStringBuilder(StringBuilder sb, int nTimes) {
        for( int i=0; i<nTimes; i++ ) {
            sb.append("*");
        }
    }

    private static void appendToString(String s1, int nTimes) {
        for( int i=0; i<nTimes; i++ ){
            s1 += "*";
        }
    }
}