import java.util.LinkedList;

public class LinkedListInClass {
    public static void main(String[] args) {
        LinkedList<String> myLL = new LinkedList<>();
        myLL.add("Apples");
        myLL.add("Bananas");
        myLL.add("Cake");
        myLL.set( 1, "Bakery");

        for( String item : myLL){
            System.out.printf("\n Item:%s", item);
        }
        System.out.printf("\n -------------------");
        for( int i=0; i<myLL.size(); i++){
            System.out.printf("\nitem:%s ", myLL.get(i));
        }
        myLL.remove( "Bakery");
        myLL.add( "Donuts");
        System.out.printf("\n -------------------");

        showList( myLL);
    }

    private static void showList(LinkedList<String> myLL) {
        for( String item : myLL){
            System.out.printf("\n Item:%s", item);
        }
    }
}
