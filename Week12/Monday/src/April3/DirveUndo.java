package April3;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class DirveUndo {
    public static void main(String[] args) {
        Deque<Command> myD = new LinkedList<>();
        boolean keepGoing = true;
        while ( keepGoing ){
            String prompt = getUserInput();
            if( prompt.equals("Stop")){
                keepGoing = false;
            } else if ( prompt.equals("Add")){
                String cmd = getCommandString();
                System.out.printf("\n cmd:%s", cmd);
                Command c = new Command( "Add", cmd);
                myD.push( c );
            } else if ( prompt.equals("Undo")){
                if ( myD.size() > 0 ) {
                    Command c = myD.pop();
                    System.out.printf("\n OK will undo the coammdn:%s", c.toString());
                } else {
                    System.out.printf("\n Nothing to undo... try adding first");
                }
            } else if ( prompt.equals("Show")){
                System.out.printf("\n ---- showing the undo stack");
                for( Command c : myD ){
                    System.out.printf("\n Item:%s", c.toString());
                }
            } else {
                System.out.printf("\n Unknown command:%s", prompt);
            }
        }
    }

    private static String getCommandString() {
        Scanner s = new Scanner(System.in);
        System.out.printf("\n Enter String to add->");
        String retCmd = s.nextLine();
        // ToDo: Really should check their input
        return retCmd;
    }

    private static String getUserInput() {
        Scanner s = new Scanner(System.in);
        System.out.printf("\n Enter Add, Show, Undo, or Stop->");
        String retCmd = s.next();
        // ToDo: Really should check their input
        return retCmd;
    }
}
