package Prep;

public class Recur1 {
    public static void main(String[] args) {
        print( 5 );
    }
    static void print(int n) {
        if (n < 0)
            return;

        System.out.print(" " + n);

        // The last executed statement
        // is recursive call
        print(n - 1);
    }
}
