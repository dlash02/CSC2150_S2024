package Prep;

import java.util.ArrayList;

public class ShowArrayList {
    public static void main(String[] args) {
        // Must be Interger (wrapper class) NOT primitive
        ArrayList<Integer> myList0 = new ArrayList<Integer>();
        // In Java can leave off second Integer
        ArrayList<Integer> myList = new ArrayList<>();
        for( int i=0; i<5; i++ ){
            myList.add( i+1 );
        }
        int totSum = getSum( myList );
        System.out.printf("\nSum:%s", totSum);
       // Example of a problem hard to do with arrays
        //   but simple with arraylists
        ArrayList<Integer> bigger = getNumbersLarger( myList, 3);

        System.out.printf("\n Bigger List -> ");
        for( int i=0; i<bigger.size(); i++ ) {
            System.out.printf("\n Item:%s", bigger.get(i));
        }
    }

    private static ArrayList<Integer> getNumbersLarger(ArrayList<Integer> myList, int n) {
        ArrayList<Integer> bigger = new ArrayList<>();
        for( int i=0; i<myList.size(); i++ ) {
            if ( myList.get(i) > n){
                bigger.add( myList.get(i));
            }
        }
        return bigger;
    }

    private static int getSum(ArrayList<Integer> myList) {
        int sum=0;
//        for ( Integer item : myList ){
        for( int i=0; i<myList.size(); i++ ) {
            sum += myList.get(i);
        }
        return sum;

    }
}
