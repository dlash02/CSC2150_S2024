package April22;

public class DriveMyGraph {
    public static void main(String[] args) {
        GraphWeighted gw = createGraphs();
        gw.printGraph();
    }

    private static GraphWeighted createGraphs() {
        GraphWeighted gw = new GraphWeighted( 4 );
        gw.addNode("Detroit");
        gw.addNode("Chicago");
        gw.addNode("New York");
        gw.addNode("Dallas");
        // add the edges
        gw.addEdge("Detroit", "Chicago", 180);
        gw.addEdge("Detroit", "New York", 250);
        gw.addEdge("New York", "Chicago", 500);
        gw.addEdge("New York", "Dallas", 800);
        return gw;
    }
}
