package HW;

import java.util.ArrayList;
import java.util.Scanner;

public class DriveBradyBunchGraph  {
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
            System.out.printf("\nNo! n1:%s No direct connected n2:%s", srcName, destName );
        }
        if (isSecondaryConnect( g, srcName, destName )){
            System.out.printf("\nYes! n1:%s direct secondary connection n2:%s", srcName, destName );
        } else {
            System.out.printf("\nNo! n1:%s No secondary connection n2:%s", srcName, destName );
        }
        if (isTertiaryConnect( g, srcName, destName )){
            System.out.printf("\nYes n1:%s direct Tertiary connection n2:%s", srcName, destName );
        } else {
            System.out.printf("\nNo! n1:%s No Tertiary connection n2:%s", srcName, destName );
        }
    }

    private static boolean isTertiaryConnect(GraphAdj g, String srcName, String destName) {

            ArrayList<String> connections = g.getConnections( srcName);
            for( String connection : connections ){
               ArrayList<String> secConnects = g.getConnections( connection);
               for( String secCon : secConnects) {
                   ArrayList<String> thirds = g.getConnections( secCon);
                   for( String third : thirds) {
                       if ( third.equals( destName)){
                           return true;
                   }
               }
            }
               return false;
        }
        return false;
    }

    private static boolean isSecondaryConnect(GraphAdj g, String srcName, String destName) {

            ArrayList<String> connections = g.getConnections( srcName);
            for( String connection : connections ){
                if ( isDirectConnect( g, connection, destName)){
                    return true;
                }
            }
        return false;
    }


    private static boolean isDirectConnect(GraphAdj g, String srcName, String destName) {
        ArrayList<String> connections = g.getConnections( srcName);
        boolean gotItem = false;
        for( String item : connections){
            if ( destName.equals(item)){
                return true;
            }
        }
        return false;
    }

    private static String getUserInput(GraphAdj g) {
        boolean keepGoing = true;
        Scanner s = new Scanner( System.in );
        String name = "";
        while( keepGoing ){
            System.out.printf("\n Enter Node->");
            name  = s.next();
            if ( g.isNode( name )){
                keepGoing=false;
            } else {
                System.out.printf("\n Name:%s is not in graph", name);
            }
        }
        return name;
    }

    private static GraphAdj createGraph() {
        GraphAdj g = new GraphAdj();
        g.addNode("Cindy");
        g.addNode("Marsha");
        g.addNode("Bobby");
        g.addNode("Greg");
        g.addNode("Peter");
        g.addNode("Jan");
        g.addEdge("Cindy", "Marsha");
        g.addEdge("Marsha", "Bobby");
        g.addEdge("Marsha", "Peter");
        g.addEdge("Greg", "Bobby");
        g.addEdge("Peter", "Marsha");
        g.addEdge("Peter", "Greg");
        g.addEdge("Jan", "Peter");
        return g;

    }

}
