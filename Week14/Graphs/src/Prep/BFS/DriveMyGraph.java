package Prep.BFS;

public class DriveMyGraph {
    public static void main(String[] args) {
        GraphWeighted gw = createGraphs();
        gw.printGraph();
        String startNode = "Houston";
        String destNode = "Detroit";
        System.out.printf("\n ---- BFS ---- ");
        int dest = gw.bfs( startNode, destNode);
        if ( gw.bfsearch(startNode, destNode)){
            System.out.printf("\n Yes start:%s to dest:%s", startNode, destNode);
        } else {
            System.out.printf("\n No start:%s to dest:%s", startNode, destNode);

        }
    }

    private static GraphWeighted createGraphs() {
        GraphWeighted gw = new GraphWeighted( 5 );
        gw.addNode("Detroit");
        gw.addNode("Chicago");
        gw.addNode("New York");
        gw.addNode("Dallas");
        gw.addNode("Houston");
        // add the edges
        gw.addEdge("Detroit", "Chicago", 180);
        gw.addEdge("Detroit", "New York", 500);
        gw.addEdge("New York", "Chicago", 600);
        gw.addEdge("New York", "Dallas", 800);
        gw.addEdge("Dallas", "Houston", 800);
        return gw;
    }
}
