public class BigOReview  {
    public static void main(String[] args) {
        int nTimes = 100000;
        int x = 100;
        methodOne( nTimes );
        methodThree( nTimes, x);
    }

    private static void methodThree(int n, int x) {
        for ( int i=0; i<n; i++){
            for ( int j=0; j<x; j++){
                System.out.printf("\n I am looping");
            }
        }
    }
    private static void methodFour(int n, int x) {
        for ( int i=0; i<n; i++){
            System.out.printf("Blah");
        }
        for ( int j=0; j<x; j++){
            System.out.printf("\n I am looping");
        }
    }
    private static void methodOne( int nTimes) {
        for ( int i=0; i<nTimes; i++){
            System.out.printf("\n I am looping");
        }
    }
    private static void methodTwo( int nTimes) {
        for ( int i=0; i<nTimes; i++){
            for ( int j=0; j<nTimes; j++){
                System.out.printf("\n I am looping");
            }
        }
    }
}
