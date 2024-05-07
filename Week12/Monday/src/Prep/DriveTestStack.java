package Prep;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class DriveTestStack {
    public static void main(String[] args) {
        Stack<String> myShoppingList = new Stack<>();
        myShoppingList.push("Apples");
        myShoppingList.push("Bananas");
        myShoppingList.push("Cake");
        myShoppingList.push("Donuts");
        myShoppingList.push("Eggs");
        myShoppingList.push("Franks");

        String topOfStack = myShoppingList.pop();
        System.out.printf("\n top:%s", topOfStack);
        String nextOne = myShoppingList.pop();
        System.out.printf("\n NextOne:%s", nextOne);

        Deque<String> myList = new ArrayDeque<>();
        myList.push("Jane");
        myList.push("Jack");
        myList.push("Joe");
        myList.push("Jackson");
        String top = myList.pop();
        System.out.printf("\n top:%s", top);
        myList.push("Zebra");
        showTheDeque( myList );
    }

    private static void showTheDeque(Deque<String> myList) {
        System.out.printf("\n ------------");
        for( String item : myList ){
            System.out.printf("\n Item:%s", item );
        }
    }
}
