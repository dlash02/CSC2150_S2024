package April19;

import java.util.ArrayList;

public class DriveMySocialNetwork {
    public static void main(String[] args) {
        GraphAdj myGraph = createGraph();
        showTheConnections( myGraph, "Bob");
        showTheConnections( myGraph, "Alice");
        showTheConnections( myGraph, "Rob");
        showTheConnections( myGraph, "Maria");
        showTheConnections( myGraph, "Mark");
        myGraph.removeEdge("Rob", "Mark");
        showTheConnections( myGraph, "Rob");

    }

    private static void showTheConnections(GraphAdj myGraph, String node) {
        ArrayList<String> connections = myGraph.getConnections(node);
        System.out.printf("\n --- Showing Direct Connections for:%s", node);
        int ct = 0;
        for( String con : connections){
            System.out.printf("\n ct:%s Name:%s", ct++, con);
        }
    }

    private static GraphAdj createGraph() {
        GraphAdj g = new GraphAdj();
        g.addNode( "Bob");
        g.addNode( "Alice");
        g.addNode( "Mark");
        g.addNode( "Maria");
        g.addNode( "Rob");
        // add connections
        g.addEdge("Bob", "Alice");
        g.addEdge("Rob", "Bob");
        g.addEdge("Rob", "Mark");
        g.addEdge("Rob", "Maria");
        g.addEdge("Mark", "Alice");
        g.addEdge("Alice", "Maria");
        return g;
    }
}
