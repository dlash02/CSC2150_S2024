package HWGrader;

import java.util.ArrayList;
import java.util.Scanner;

public class DriveBradyBunchGraphHW {
    public static void main(String[] args) {

        GraphAdj g = createGraph();      // Construct the graph
        System.out.printf("\n ---- Getting Source Node ->");
        String srcName = getUserInput(g); // Get starting node from user
        System.out.printf("\n ---- Getting Dest Node ->");
        String destName = getUserInput(g);  // get ending node from user
        System.out.printf("\n Showing Connections ----- ");
        if (isDirectConnect(g, srcName, destName)) {
            System.out.printf("\nYes n1:%s direct connected n2:%s", srcName, destName);
        } else {
            System.out.printf("\nNo! NOT  n1:%s direct connected n2:%s", srcName, destName);
        }
        if (isSecondaryConnect(g, srcName, destName)) {
            System.out.printf("\nYes! n1:%s direct secondary connection n2:%s", srcName, destName);
        } else {
            System.out.printf("\nNo! n1:%s No secondary connection n2:%s", srcName, destName);
        }
        if (isTertiaryConnect(g, srcName, destName)) {
            System.out.printf("\nYes n1:%s direct Teritiary connection n2:%s", srcName, destName);
        } else {
            System.out.printf("\nNo! n1:%s No Teritiary connection n2:%s", srcName, destName);
        }
    }


    private static boolean isTertiaryConnect(GraphAdj g, String srcName, String destName) {
        if (!g.isNode(srcName)) {
            System.out.println("\nNode does not exist in the graph");
            return false;
        }
        if (!g.isNode(destName)) {
            System.out.printf("\nNode: %s not in the graph", destName);
            return false;
        }
        if (isDirectConnect(g, srcName, destName) == false) {
            ArrayList<String> closeConnection = g.getConnections(srcName);
            for (String neighbor : closeConnection) {
                ArrayList<String> neighborNeighbors = g.getConnections(neighbor);
                for (String neighborNeighbor : neighborNeighbors) {
                    ArrayList<String> thirdNeighbor = g.getConnections(neighborNeighbor);
                    if (thirdNeighbor.contains(destName)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }


    private static boolean isSecondaryConnect(GraphAdj g, String srcName, String destName) {
        ArrayList<String> closeConnection = g.getConnections(srcName);
        for (String neighbor : closeConnection) {
            ArrayList<String> neighborNeighbors = g.getConnections(neighbor);
            if (neighborNeighbors.contains(destName)) {
                return true;
            }
        }
        return false;
    }


    private static boolean isDirectConnect(GraphAdj g, String srcName, String destName) {
        if (!g.isNode(srcName)) {
            System.out.println("\nSource node not in the graph");
            return false;
        }
        if (!g.isNode(destName)) {
            System.out.printf("\nNode: %s not in the graph", destName);
            return false;
        }
        ArrayList<String> connections = g.getConnections(srcName);
        if (connections.contains(destName)) {
            return true;
        } else {
            return false;
        }
    }


    private static String getUserInput(GraphAdj g) {
        Scanner scanner = new Scanner(System.in);
        String userInput = "";
        while (true) {
            System.out.print("\nEnter Node: ");
            userInput = scanner.nextLine();
            if (g.isNode(userInput)) {
                break;
            } else {
                System.out.printf("\nName: %s not in the graph", userInput);
            }
        }
        return userInput;
    }


    private static GraphAdj createGraph() {
        GraphAdj g = new GraphAdj();
        g.addNode("Cindy");
        g.addNode("Jan");
        g.addNode("Marsha");
        g.addNode("Peter");
        g.addNode("Greg");
        g.addNode("Bobby");

        g.addEdge("Cindy", "Marsha");
        g.addEdge("Jan", "Peter");
        g.addEdge("Marsha", "Bobby");
        g.addEdge("Marsha", "Peter");
        g.addEdge("Peter", "Marsha");
        g.addEdge("Peter", "Greg");
        g.addEdge("Greg", "Bobby");
        return g;
    }

}
