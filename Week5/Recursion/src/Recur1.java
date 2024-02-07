package Recursion.src;

public class Recur1 {
    public static void main(String[] args) {
        System.out.printf("Sum1:%s", getSumNonRecur( 5));
        System.out.printf("Sum1:%s", getSumRecur( 5));
    }

    private static int getSumRecur(int n) {
        int sum = 0;
        // 1. Exit case or base case
        if ( n == 1 ) return 1;
        return n+getSumRecur( n-1 );
    }

    private static int getSumNonRecur(int n) {
        int sum = 0;
        for( int i=0; i<=n; i++){
            sum += i;
        }
        return sum;
    }
}
