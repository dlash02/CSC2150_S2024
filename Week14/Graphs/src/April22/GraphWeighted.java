package April22;

import java.util.ArrayList;
import java.util.HashMap;

public class GraphWeighted {
//    ArrayList<ArrayList<GraphWeightedEdge>> adjList = new ArrayList<>();
    private HashMap< String, ArrayList<GraphWeightedEdge>> adjList2 = new HashMap<>();
    private int nodes;

    public GraphWeighted(int nodes) {
        this.nodes = nodes;
    }
    public void addNode( String nodeName ){
        ArrayList<GraphWeightedEdge> edges = new ArrayList<>();
        adjList2.put( nodeName, edges);
    }
    public boolean addEdge( String sourceNode, String destNode, int weight ) {
        if (!adjList2.containsKey(sourceNode)) {
            return false;
        }
        if (!adjList2.containsKey(destNode)) {
            return false;
        }
        ArrayList<GraphWeightedEdge> edges = adjList2.get(sourceNode);
        GraphWeightedEdge gwe = new GraphWeightedEdge(sourceNode, destNode, weight);
        edges.add(gwe);
        adjList2.put(sourceNode, edges);
        return true;
    }
    public void printGraph() {
        for ( String nodeName : adjList2.keySet()){
            ArrayList<GraphWeightedEdge> edges = adjList2.get(nodeName);
            System.out.printf("\n Node:%s", nodeName);
            for( GraphWeightedEdge edge : edges){
                System.out.printf("\n Edge:%s distance:%s", edge.getDestination(), edge.getWeight());
            }
        }
    }
}
