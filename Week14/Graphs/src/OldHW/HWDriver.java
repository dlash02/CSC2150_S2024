package OldHW;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;

public class HWDriver {
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
        for( String key : g.getKeys()){
            System.out.printf("\n Showing connections for key:%s ---------", key);
            ArrayList<Vertex> vertices = g.getConnections(key);
            for( Vertex v : vertices) {
                System.out.printf("\n City:%s Dest:%s", v.label, v.weight);
            }
        }
    }

    private static String getLayOverCity(Set<String> keys, String startCity) {
        String oStr = "";
        String cma = "";
        for( String k : keys ){
            if ( k.equalsIgnoreCase(startCity)){
//                System.out.printf("\n oppss k:%s start:%s", k, startCity);
                continue;
            }
            oStr += cma + k;
            cma = ",";
        }
        System.out.printf("\nSelect a layover City (%s)", oStr );
        Scanner s = new Scanner(System.in);
//        s.nextLine();
        return s.nextLine();
    }

    private static void showConnections(HWGraph g, Vertex layOverVertex) {
        int startDestDist = layOverVertex.weight;
        int sum = startDestDist;
        ArrayList<Vertex> connections = g.getConnections(layOverVertex.label);
        for( Vertex v : connections){
//            sum += v.weight;
            System.out.printf("\n Name:%s Distance:%s Total Distance:%s", v.label, v.weight, v.weight+startDestDist);
        }
    }

    private static HWGraph createGraph() {
        HWGraph g = new HWGraph();
        g.addVertex("Chicago");
        g.addVertex("New York");
        g.addVertex("Dallas");
        g.addVertex("Atlanta");
        g.addVertex("Orlando");
        g.addVertex("Houston");

        // --- now add connections
        g.addEdge("Chicago",new Vertex( "New York", 790));
        g.addEdge("Chicago",new Vertex( "Dallas", 968));
        g.addEdge("Chicago",new Vertex( "Atlanta", 718));

        g.addEdge("Dallas",new Vertex( "Houston", 239));
        g.addEdge("Dallas",new Vertex( "Orlando", 1120));

        g.addEdge("Atlanta",new Vertex( "New York", 870));
        g.addEdge("Atlanta",new Vertex( "Orlando", 438));

        g.addEdge("New York",new Vertex( "Houston", 1647));
        g.addEdge("New York",new Vertex( "Orlando", 1080));


        g.addEdge("Houston",new Vertex( "Orlando", 976));



        return g;
    }
}
