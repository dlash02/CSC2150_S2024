package April3;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class DriveStacks {
    public static void main(String[] args) {
        Stack<String> myStack = new Stack<>();
        myStack.push("Apples");
        myStack.push("Bananas");
        myStack.push("Cookies");
        System.out.printf("\n Size:%s", myStack.size());

        String top = myStack.pop();
        System.out.printf("\n Size:%s top:%s", myStack.size(),top);
        System.out.printf("\n Size:%s top:%s", myStack.size(),myStack.peek());

        // ---- Dont use stack ---- Instead use deque
        Deque<String> myD = new ArrayDeque<>();
        myD.push( "Able");
        myD.push("Baker");
        myD.push( "Charlie");
        myD.push( "Dog");
        System.out.printf("\n Peek%s", myD.peek());
        showMyDeque( myD );
        String item = myD.pop();
        System.out.printf("\n Popped the%s", item);
        showMyDeque( myD );
        String first = myD.getFirst();
        System.out.printf("\n First:%s", first );
        String last = myD.getLast();
        System.out.printf("\n Last:%s", last);
    }

    private static void showMyDeque(Deque<String> myD) {
        for( String item : myD){
            System.out.printf("\n Item:%s", item);
        }
    }
}
