package Prep.BFS;

import java.util.ArrayList;
import java.util.HashMap;

public class GraphDirectedAdjMatrix {
    int[][] adjMatrix;
    HashMap<Integer,  String> nodeNames = new HashMap<>();
    int nodeCt = 0;
    int pos = 0;
    public GraphDirectedAdjMatrix(int nodeCt){
        this.nodeCt = nodeCt;
        adjMatrix = new int[nodeCt][nodeCt];
        for ( int row=0; row<adjMatrix.length; row++){
            for( int col=0; col<adjMatrix.length; col++){
                adjMatrix[row][col] = 0;
            }
        }
    }
    public void addNode( int pos, String nodeName ){
        nodeNames.put( pos, nodeName);
    }
    public void addConnect( int fromNode, int toNode){
        if( !nodeNames.containsKey(fromNode)){
            System.out.printf("\n Error cannot use fromNode:%s without adding it first", fromNode);
        }
        adjMatrix[fromNode][toNode] = 1;
    }
   public void  showMatrix( ){
       System.out.printf("\n ---- showing matrix ");
       for ( int row=0; row<adjMatrix.length; row++){
           System.out.printf("\nNode-%s ", nodeNames.get(row));
           for( int col=0; col<adjMatrix.length; col++){
               System.out.printf("%s ", adjMatrix[row][col]);
           }
       }
   }
   public void showDirectConnect( int nodeSpot ){
        int[] rowItems = adjMatrix[nodeSpot];
       System.out.printf("\n Showing NOde:%s ->", nodeNames.get( nodeSpot));
       for( int spot=0; spot< rowItems.length; spot++){
           if ( rowItems[spot] == 1 ) {
               System.out.printf("%s ", nodeNames.get(spot));
           }
       }
   }
}
