package LinkedListPrep;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DriveLList {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add( 100);
        myList.set( 0, 200);
        LinkedList<Integer> myLLList = new LinkedList<>();
        myLLList.add( 10);
        myLLList.add( 20);
        myLLList.add( 30);
        myLLList.add( 40);
        myLLList.add( 50);
        for( int item : myLLList){
            System.out.printf("\n item:%s", item );
        }
        myLLList.addFirst( 13 );
        int last = myLLList.getLast();
        last = myLLList.removeLast();
        int first = myLLList.removeFirst();
        System.out.printf("\n First was:%s and last was %s", first, last);
        myLLList.set( 2, 22);
        LinkedList<String> linkedList = new LinkedList<>();
        System.out.printf("\n ------------------");
        for( int item : myLLList){
            System.out.printf("\n item:%s", item );
        }


    }
}
