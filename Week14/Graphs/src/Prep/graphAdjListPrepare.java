package Prep;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class graphAdjListPrepare {
    public static void main(String[] args) {
        int items = 10;
        ArrayList<ArrayList<Integer>> myList = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> row1 =new ArrayList<Integer>();
        row1.add( 5);
        row1.add( 10);
        row1.add( 15);
        myList.add(row1);

        myList.add(new ArrayList<Integer>());
        myList.get(1).add(20);
        myList.get(1).add(25);
        myList.get(1).add(30);
        myList.get(1).add(35);

        int ct = 0;
        for( ArrayList<Integer> row : myList ) {
            System.out.printf(" \n ct:%s", ct++);
            for( Integer r : row ) {
                System.out.printf(" item:%s", r);
            }

        }

    }
}
