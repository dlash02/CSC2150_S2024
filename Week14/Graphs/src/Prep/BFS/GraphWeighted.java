package Prep.BFS;

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

    public int bfs(String startNode, String destNode) {
        HashMap<String, Boolean> nodesVisited = new HashMap<>();
        String item = "";
        Deque<String> nodeQueue = new LinkedList<>();
        nodesVisited.put( startNode, true);
        nodeQueue.addLast( startNode );
        while ( nodeQueue.size() != 0 ){
            String nodeToExamine = nodeQueue.removeFirst();
            System.out.printf("\n - Node->%s", nodeToExamine);
            nodesVisited.put( nodeToExamine, true);
            ArrayList<GraphWeightedEdge> targetConnects = adjList2.get( nodeToExamine );
            for( GraphWeightedEdge gwe : targetConnects) {
                if( !nodesVisited.containsKey(gwe.getDestination())){
//                    System.out.printf("\n adding last %s", gwe.getDestination());
                    nodeQueue.addLast( gwe.getDestination());
                }
            }
        }
        return 1;
    }
    public Boolean  bfsearch(String startNode, String destNode) {
        HashMap<String, Boolean> nodesVisited = new HashMap<>();
        String item = "";
        Deque<String> nodeQueue = new LinkedList<>();
        nodesVisited.put( startNode, true);
        nodeQueue.addLast( startNode );
        while ( nodeQueue.size() != 0 ){
            String nodeToExamine = nodeQueue.removeFirst();
            if ( nodeToExamine.equals(destNode)){
                return true;
            }
            System.out.printf("\n Its Not - Node->%s", nodeToExamine);
            nodesVisited.put( nodeToExamine, true);
            ArrayList<GraphWeightedEdge> targetConnects = adjList2.get( nodeToExamine );
            for( GraphWeightedEdge gwe : targetConnects) {
                if( !nodesVisited.containsKey(gwe.getDestination())){
//                    System.out.printf("\n adding last %s", gwe.getDestination());
                    nodeQueue.addLast( gwe.getDestination());
                }
            }
        }
        return false;
    }
}
