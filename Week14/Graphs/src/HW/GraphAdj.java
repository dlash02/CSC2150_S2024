package HW;

import java.util.ArrayList;
import java.util.HashMap;

public class GraphAdj {
    public HashMap<String, ArrayList<String>> adjList =
                        new HashMap<String, ArrayList<String>>();

    public void addNode( String nodeName ){
        ArrayList<String> nList = new ArrayList();
        adjList.put( nodeName, nList);
    }
    public void addEdge( String nodeName, String connectNodeName ){
        ArrayList<String> theList = adjList.get(nodeName);
        theList.add( connectNodeName);
        adjList.put( nodeName, theList);
    }
    public void removeEdge( String nodeName, String connectNodeName ){
        ArrayList<String> theList = adjList.get(nodeName);
        theList.remove( connectNodeName);
        adjList.put( nodeName, theList );
    }
    public boolean isNode( String nodeName ){
        return adjList.containsKey(nodeName);
    }
    public ArrayList<String> getConnections( String nodeName){
        return adjList.get( nodeName );
    }
}
