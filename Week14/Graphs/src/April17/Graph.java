package April17;

import java.util.Arrays;

public class Graph {
    private boolean adjMatrix[][];
    private int numNodes;

    public Graph(int numNodes) {
        this.numNodes = numNodes;
        adjMatrix = new boolean[numNodes][numNodes];
        for( int r=0; r<adjMatrix.length; r++ ){
           for( int c=0; c<adjMatrix[r].length; c++ ) {
               adjMatrix[r][c] = false;
           }
        }
    }
    public void addEdge( int node1, int node2 ){
        adjMatrix[node1][node2] = true;
        adjMatrix[node2][node1] = true;
    }
    public void addEdgeDirected( int node1, int node2 ){
        adjMatrix[node1][node2] = true;
//        adjMatrix[node2][node1] = true;
    }
    public boolean[] getConnectedTo( int node ){
        //Todo: return an array of all the nodes that input node is connected to
        boolean[] row = null;
        if (  node > adjMatrix.length-1 || node < 0 ){
            System.out.printf("\n Illegal Node:%s", node );
        } else {
             row = adjMatrix[node];
        }
        return row;
    }
    public boolean isConnection( int startNode, int destNode ){
        boolean[] theRow = getConnectedTo( startNode );
        return theRow[destNode];
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for( int r=0; r<numNodes; r++){
            sb.append( r + ":");
            for( boolean c : adjMatrix[r ]){
                if ( c ){
                    sb.append( "1 " );
                } else {
                    sb.append( "0 " );
                }
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
