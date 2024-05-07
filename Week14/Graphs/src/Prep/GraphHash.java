package Prep;

import java.util.ArrayList;
import java.util.HashMap;

public class GraphHash {
    public HashMap< String, ArrayList<String>> adjList = new HashMap<>();

    public void addVertex( String label ){
        // Create a new AL for this vertix
        ArrayList<String> grList= new ArrayList<>();
        // Put the empty array associated with label
        adjList.put( label, grList );
    }
    public void addEdge( String vert, String newVert ) {
        adjList.get(vert).add( newVert);
        //adjList.get(newVert).add( vert);
    }

    public ArrayList<String> getAdjVertices( String label ){
        return adjList.get(label);
    }
}
