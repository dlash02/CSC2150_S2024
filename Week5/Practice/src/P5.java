public class P5 {
    public static void main(String[] args) {
        int max = 4;
        // ToDo: Write the following method that
        //     USES RECURSION to sum the odd numbers from 1-max
        //     E.g., if max was 5 is would return  9 (5+3+1)
         int sum = sumOdd( max );
        System.out.printf("Odd:%s", sum );
    }

    private static int sumOdd(int max) {
        if ( max == 1 ) return 1;
        if ( max %2 == 1){
            return max+sumOdd( max -1);
        } else {
            return sumOdd( max-1);
        }
    }

}
