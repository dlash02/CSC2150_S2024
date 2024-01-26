package Prep;

import java.util.ArrayList;

public class ArrayListWithStrings  {
    public static void main(String[] args) {
        ArrayList<String> myStrings = new ArrayList<>();
        myStrings.add("Apple");
        myStrings.add("Baker");
        myStrings.add("Sally");
        showArrayList( myStrings);
    }

    private static void showArrayList(ArrayList<String> myStrings) {
        for( String s : myStrings){
            System.out.printf("\n S:%s", s);
        }
    }
}
