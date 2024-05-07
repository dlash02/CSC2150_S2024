package Prep;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Scanner;

public class adjMatrix {
    public static void main(String[] args) {
        int[][] aMatrix = getAdjMatric();
        String[] nodes  = setNodeNames();
        String item = getItemToShow( nodes );
        int indx = findThisItemIdx( item, nodes );
        if ( indx == -1){
            System.out.printf("\n Sorry that item=%s is not found", item);
        }
        showWhatIsConnectedTo( indx, aMatrix, nodes );
        // ToDo: Add the nodes argument to the method
        //     output the name of all the node to connect to
        //     my time: 2 minutes Rx time: 5 minutes
        //showWhatIsConnectedTo( indx, nodes, aMatrix );
    }

    private static int findThisItemIdx(String item, String[] nodes) {
        int i = 0;
        for( String node : nodes   ){
            if ( node.equalsIgnoreCase(item)){
                return i;
            }
            i++;
        }
        return -1;
    }

    private static String[] setNodeNames() {
        String[] nodes = { "Seattle", "San Francisco","Los Angeles",
        "Denver", "Kansas City", "Chicago", "Boston", "New York",
        "Atlanta", "Miami", "Dallas", "Houston" };
        return nodes;
    }

    private static void showWhatIsConnectedTo(int row, int[][] aMatrix, String[] nodes) {
        System.out.printf("\n Starting ");
        boolean gotOne = false;
        String oStr = "";
        for( int i=0; i<aMatrix.length; i++ ){
            if ( i==row){
                for( int j=0; j<aMatrix.length; j++ ) {
                    if( aMatrix[i][j] == 1 ){
                        oStr += oStr.format("(c:%s) Name:%s", j, nodes[j]);
                        gotOne = true;
                    }
                }
            }
        }
        if ( gotOne ) {
            System.out.printf("\n --- %s", oStr);
        } else {
            System.out.printf("\n No connecting cities  found ");

        }
    }

    private static String getItemToShow( String[] nodes) {
        String cm = "";
        String oStr = "";
        for( String node : nodes ){
           oStr += cm + node;
           cm = ", ";
        }
        Scanner s = new Scanner( System.in );
        System.out.printf("\nWhich item you wanna see? (%s)", oStr );
        String item =  s.next();
        return item;
    }


    private static HashMap<String, Integer> setNodes() {
        HashMap<String, Integer> nodes = new HashMap<>();
        nodes.put( "Seattle", 0 );
        nodes.put( "San Francisco", 1);
        nodes.put( "Los Angeles", 2 );
        nodes.put( "Denver", 2 );
        nodes.put( "Kansas City", 3);
        nodes.put( "Chicago", 4 );
        nodes.put( "Boston", 5 );
        nodes.put( "New York", 6 );
        nodes.put( "Atlanta", 7 );
        nodes.put( "Miami", 8);
        nodes.put( "Dallas", 9 );
        nodes.put( "Houston", 10 );
        return nodes;
    }
    private static int[][] getAdjMatric() {
         int[][] adjacencyMatrix = {
            {0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0}, // Seattle
            {1, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0}, // San Francisco
            {0, 1, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0}, // Los Angeles
            {1, 1, 1, 0, 1, 1, 0, 0, 0, 0, 0, 0}, // Denver
            {0, 0, 1, 1, 0, 1, 0, 1, 1, 0, 1, 0}, // Kansas City
            {1, 0, 0, 1, 1, 0, 1, 1, 0, 0, 0, 0}, // Chicago
            {0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0}, // Boston
            {0, 0, 0, 0, 1, 1, 1, 0, 1, 0, 0, 0}, // New York
            {0, 0, 0, 1, 1, 0, 0, 1, 0, 1, 1, 1}, // Atlanta
            {0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1}, // Miami
            {0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 1}, // Dallas
            {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0}  // Houston
         };
         return adjacencyMatrix;
    };

}
