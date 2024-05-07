package April5;


import java.util.Arrays;

public class SecondLargest {
        public static void main(String[] args) {
            int[] myList = { 10, 13, 1, 2, 33, 12, 1, 13 };
            int n = secondLargest( myList );
            showSecondLargest( myList, n );

            int [] myList2 = { -1, 0, -2, -2, -3, -1, 1, -2 };
            n = secondLargest( myList2 );
            showSecondLargest( myList2, n );

            int [] myList3 = { 2, 2 };
            n = secondLargest( myList3 );
            showSecondLargest( myList3, n );

            int [] myList4 = { -1 , -22, -3 };
            n = secondLargest( myList4 );
            showSecondLargest( myList4, n );

            int [] myList5 = { 100, 90, 80, 70, 60 };
            n = secondLargest( myList5 );
            showSecondLargest( myList5, n );

            int [] myList6 = { 0, 10, 20, 40, 60 };
            n = secondLargest( myList6 );
            showSecondLargest( myList6, n );
        }

        private static void showSecondLargest(int[] myList, int n) {
            System.out.printf("\nSecond largest of %s is %s", Arrays.toString(myList), n);
        }

        private static int secondLargest(int[] myList) {
            int sL = 0;
            int largest = myList[0];
            int secondLargest = largest;
            for ( int i : myList ) {
                if ( i > largest ){
                    secondLargest = largest;
                    largest = i;
                } else if ( secondLargest == largest || i > secondLargest){
                    secondLargest = i;
                }
            }
            return secondLargest;
        }
    }
