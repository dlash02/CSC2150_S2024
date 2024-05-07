package April24;

import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;

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
    public boolean breathFirstSearch( String startN, String endN ){
        boolean foundIt = false;
        HashMap<String, Boolean> nodesVisited = new HashMap<>();
        Deque<String> workQueue = new LinkedList<>();
        workQueue.addLast( startN );
//        nodesVisited.put( startN, true);
        while( workQueue.size() != 0 ){
            String nodeToExamine = workQueue.removeFirst();
            System.out.printf("\n Node->%s", nodeToExamine);
            if ( nodeToExamine.equals(endN)){
                return true;
            }
            nodesVisited.put( nodeToExamine, true );
            ArrayList<GraphWeightedEdge> nodeDirectConnects = adjList2.get(nodeToExamine);
            for( GraphWeightedEdge gwe : nodeDirectConnects){
                if ( !nodesVisited.containsKey(gwe.getDestination())){
                    workQueue.addLast( gwe.getDestination());
                }
            }
        }
        return foundIt;
    }
}
