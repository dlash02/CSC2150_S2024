package HW;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class DriveBradyBunchGraphHW {
    public static void main(String[] args) {

        GraphAdj g = createGraph();      // Construct the graph
        System.out.printf("\n ---- Getting Source Node ->");
        String srcName = getUserInput( g ); // Get starting node from user
        System.out.printf("\n ---- Getting Dest Node ->");
        String destName = getUserInput( g );  // get ending node from user
        System.out.printf("\n Showing Connections ----- ");
        if (isDirectConnect( g, srcName, destName )){
            System.out.printf("\nYes n1:%s direct connected n2:%s", srcName, destName );
        } else {
            System.out.printf("\nNo! n1:%s not direct connected n2:%s", srcName, destName );
        }
        if (isSecondaryConnect( g, srcName, destName )){
            System.out.printf("\nYes! n1:%s is secondary connection n2:%s", srcName, destName );
        } else {
            System.out.printf("\nNo! n1:%s No secondary connection n2:%s", srcName, destName );
        }
        if (isTertiaryConnect( g, srcName, destName )){
            System.out.printf("\nYes n1:%s is Teritiary connection n2:%s", srcName, destName );
        } else {
            System.out.printf("\nNo! n1:%s No Teritiary connection n2:%s", srcName, destName );
        }
    }

    private static boolean isSecondaryConnect(GraphAdj g, String srcName, String destName) {
        ArrayList<String> srcConnections = g.getConnections(srcName);
        if (srcConnections != null) {
            for (String connection : srcConnections) {
                ArrayList<String> connectionConnections = g.getConnections(connection);
                if (connectionConnections != null && connectionConnections.contains(destName)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean isTertiaryConnect(GraphAdj g, String srcName, String destName) {
        ArrayList<String> srcConnections = g.getConnections(srcName);
        if (srcConnections != null) {
            for (String connection : srcConnections) {
                ArrayList<String> connectionConnections = g.getConnections(connection);
                if (connectionConnections != null && connectionConnections.contains(destName)) {
                    return true;
                }
                if (isSecondaryConnect(g, connection,destName)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean isDirectConnect(GraphAdj g, String srcName, String destName) {
        //ToDo: Write this method that
        // Returns True is srcName has a direct connection to destName
        //        else return false
        ArrayList<String> srcConnections = g.getConnections(srcName);
       return srcConnections != null && srcConnections.contains(destName);
    }

    private static String getUserInput(GraphAdj g) {
        // ToDo: write method that
        //   1. prompts user for a node
        //   2. If user input node is not in graph output a message and re-prompt
        //   3. If user input node is in graph then return that node
        Scanner scanner = new Scanner(System.in);
        String userInput;
        do {
            System.out.println("Enter a node: ");
            userInput = scanner.nextLine();
            if (!g.isNode(userInput)) {
                System.out.println("Node not found in graph. Try again.");
            }
        } while (!g.isNode(userInput)) ;
        return userInput;
    }

    private static GraphAdj createGraph() {
        GraphAdj g = new GraphAdj();
        // Todo: Build the graph for the problem
        g.addNode("Cindy");
        g.addNode("Marsha");
        g.addNode("Bobby");
        g.addNode("Peter");
        g.addNode("Greg");
        g.addNode("Jan");

        //edges
        g.addEdge("Cindy", "Marsha");
        g.addEdge("Marsha", "Bobby");
        g.addEdge("Marsha", "Peter");
        g.addEdge("Peter", "Greg");
        g.addEdge("Greg", "Bobby");
        g.addEdge("Jan", "Peter");
        // Return the  graph
        return g;
    }

}
