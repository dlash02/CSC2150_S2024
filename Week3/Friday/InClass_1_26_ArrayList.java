package Friday;

import java.util.ArrayList;

public class InClass_1_26_ArrayList {
    public static void main(String[] args) {
        // Technically need to use wrapper classes to specify data type
        ArrayList<Integer> myList = new ArrayList<>(1000);
//        ArrayList<Double> myList2 = new ArrayList<>();
        ArrayList<String> myNames = new ArrayList<>();
        myNames.add("Mikey");
        myNames.add("Janet");
        myNames.add( "James");
        myNames.add( "Zebra");
        myNames.remove(1);
        showThisList( myNames);

//        ArrayList<Character> myNamesChar = new ArrayList<>();
//        ArrayList<Boolean> myNamesBol = new ArrayList<>();
//
//        int x = 12;
//        Integer y = 12;

        myList.add( 5 );
        myList.add( 10 );
        myList.add( 15 );
        myList.add( 20 );
        showTheList( myList );
        System.out.printf("\n -------------------------------");
        showTheListV2( myList );

    }

    private static void showThisList(ArrayList<String> myNames) {
        for( String name : myNames ){
            System.out.printf("\n N:%s", name);
        }
    }

    private static void showTheListV2(ArrayList<Integer> myList) {
        for ( int i=0; i<myList.size(); i++ ){
            Integer item = myList.get(i);
            System.out.printf("\n ItemV2:%s", item);
        }
    }

    private static void showTheList(ArrayList<Integer> myList) {
        for( Integer item : myList){
            System.out.printf("\n Item:%s", item);
        }
    }
}
