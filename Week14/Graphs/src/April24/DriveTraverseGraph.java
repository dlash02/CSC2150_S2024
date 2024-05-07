package April24;



public class DriveTraverseGraph {
    public static void main(String[] args) {
        GraphWeighted gwe = createGraphs();
//        gwe.printGraph();
        boolean res = gwe.breathFirstSearch( "Detroit", "Houston");
        if ( res ){
            System.out.printf("\nYes there is a path");
        } else {
            System.out.printf("\n No path for you");
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
            gw.addEdge("Chicago", "Detroit", 180);
            gw.addEdge("Detroit", "New York", 500);
            gw.addEdge("New York", "Chicago", 600);
            gw.addEdge("New York", "Dallas", 800);
            gw.addEdge("Dallas", "Houston", 180);
            return gw;
        }
    }

