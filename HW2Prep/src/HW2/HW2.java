package HW2;

import java.util.ArrayList;
import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {
        ArrayList<Item> items = getInventory();
        showItems(items);
        ArrayList<String> types = getTypesFromInventory( items );
//        showTypes(types);
        String uType = getTypeFromUser( types);
        System.out.printf("\n -- Showing all items of type:%s", uType);
        ArrayList<Item> userItems = getTheseTypes( items, uType );
        showItems(userItems);
        showItemsAndCost(  userItems, uType );
    }

//    private static void showTypes(ArrayList<String> types) {
//        for(String type: types ){
//            System.out.printf("\n Types:%s,", type);
//        }
//    }

    private static void showItems( ArrayList<Item> items) {
        for(Item item: items ){
            System.out.printf("\n Item:%s Cost:%s Count:%s", item.getName(), item.getCost(), item.getCount());
        }
    }

    private static void showItemsAndCost(ArrayList<Item> userItems, String uType ) {
        for (Item item: userItems){
            if(item.reorderItem()){
                System.out.printf("\n Reorder:%s", item.getName());
            }
        }
        for (Item item: userItems){
            if(! item.reorderItem()){
                System.out.printf("\n Not Reorder:%s", item.getName());
            }
        }
        for (Item item: userItems){
            if( item.reorderItem()){
                System.out.printf("\n Item Cost:$%s", item.getCost());
            }
        }
        for (Item item: userItems){
            if( item.reorderItem()){
                System.out.printf("\n Total:$%s", item.getTotalCost());
            }
        }

////       // ToDo: Write this method that:
////        // 1. outputs all items that are of type uType that need to be
////        //    reordered
////        // 2. Then outputs al items that are of type uType that do NOT need
////        //    to be reordered
////        // 3. Make sure all items that hold dollar amounts are properly rounded
////        //    have a $ in front of them.
    }
////
    private static ArrayList<Item> getTheseTypes(ArrayList<Item> items, String uType) {
        ArrayList<Item> userItems = new ArrayList<>();
        for (Item item : items){
            if( item.getType().equals(uType)){
                userItems.add(item);
            }
        }
        return userItems;
    }
    private static String getTypeFromUser(ArrayList<String> types) {
        String uInput = "";
        boolean keepGoing = true;
        while (keepGoing == true){
            System.out.printf("\n Enter Type%s", types.toString());
            Scanner s = new Scanner(System.in);
            uInput = s.next();
            if(  ! types.contains(uInput)){
                System.out.printf("Invaild Input");
            }
            else{
                keepGoing = false;
            }
        }
        return uInput;
    }
    private static ArrayList<Item> getInventory() {
        ArrayList<Item> inventory = new ArrayList<>();
//        // Predefined item data
        String[] itemNames = {"Nimbus 2000", "Invisibility Cloak", "Elder Wand", "Firebolt", "Blackthorn wand", "Sorcerer's Stone"};
        int[] itemCounts = {10, 5, 20, 15, 8, 2};
        int[] reorderMin = {9, 10, 19, 16, 8, 5};
        double[] itemCosts = {50.99, 19.99, 80.99, 61.50, 40.99, 129.99};
        String[] itemTypes = {"Flying", "Stealth", "Magic", "Flying", "Magic", "Magic"};

        for (int i = 0; i < itemNames.length; i++) {
            int id = i + 1; // Assuming ids start from 1
            String name = itemNames[i];
            int count = itemCounts[i];
            double cost = itemCosts[i];
            String type = itemTypes[i];
            int reorderMinCt = reorderMin[i];
//            //ToDo: Create the Item class
            Item item = new Item(id, name, count, cost, type, reorderMinCt);
            inventory.add(item);
        }
        return inventory;
    }
    private static ArrayList<String> getTypesFromInventory( ArrayList<Item> items) {
        ArrayList<String> types = new ArrayList<>();
        for (Item item: items){
            String type = item.getType();
            if( ! types.contains(type) ){
                types.add(type);
            }
        }
        return types;
    }
}
