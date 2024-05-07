package OldHW;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;

public class HWDriverPrep {
    public static void main(String[] args) {
        HWGraph g = createGraph();
        printGraph( g );
        Set<String> keys = g.getKeys();
        String startCity = "Chicago";
        String layOver = getLayOverCity( keys, startCity);
        Vertex v = g.getThisVertex( startCity, layOver);
        System.out.printf("\n The connections from Start:%s with layover N:%s are (%s):", startCity, v.label, v.weight);

        showConnections( g, v );
    }

    private static void printGraph(HWGraph g) {
        //ToDo: Write This Method
        // What: This method should accept a constructuted graph and output the complete graph
        //    It should show the node and each connection to the node.
    }

    private static String getLayOverCity(Set<String> keys, String startCity) {
        //ToDo: Write This Method
        // What:  This method should show all the keys that are NOT the startCity
        //        and prompt the user for a layover city.
        // Returns: the city that the user input

        return null;
    }

    private static void showConnections(HWGraph g, Vertex layOverVertex) {
      // ToDo: Write this method
        // What: This method inputs the graph (g) and the layoverVertex.
        // Output: All of the cities connected to the layover vertex, their distance and total distance from Chicago
        // E.g.,
        // The connections from Start:Chicago with layover N:New York are (790):
        //      Name:Houston Distance:1647 Total Distance:2437
        //     Name:Orlando Distance:1080 Total Distance:1870
    }

    private static HWGraph createGraph() {
        //Todo: Write this method
        // Create the directed graph shown in the problem. Properly construct it to connect all node
        // Returns: The properly connected HWGraph
        return null;
    }
}
