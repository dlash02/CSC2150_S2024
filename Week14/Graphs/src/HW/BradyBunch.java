package HW;

    import java.util.ArrayList;
import java.util.Scanner;
    public class BradyBunch {
        public static void main(String[] args) {

            GraphAdj g = createGraph();      // Construct the graph
            System.out.printf("\n ---- Getting Source Node ->");
            String srcName = getUserInput( g ); // Get starting node from user
            System.out.printf("\n ---- Getting Dest Node ->");
            String destName = getUserInput( g );  // get ending node from user
            System.out.printf("\n Showing Connections ----- ");
            if (isDirectConnect( g, srcName, destName )){
                System.out.printf("\nYes n1:%s direct connected n2:%s", srcName, destName );
            } else {
                System.out.printf("\nNo! NOT  n1:%s direct connected n2:%s", srcName, destName );
            }
            if (isSecondaryConnect( g, srcName, destName )){
                System.out.printf("\nYes! n1:%s direct secondary connection n2:%s", srcName, destName );
            } else {
                System.out.printf("\nNo! n1:%s No secondary connection n2:%s", srcName, destName );
            }
            if (isTertiaryConnect( g, srcName, destName )){
                System.out.printf("\nYes n1:%s direct Teritiary connection n2:%s", srcName, destName );
            } else {
                System.out.printf("\nNo! n1:%s No Teritiary connection n2:%s", srcName, destName );
            }
        }

        private static boolean isTertiaryConnect(GraphAdj g, String srcName, String destName) {
            return g.getConnections(srcName).contains(destName);
        }
        private static boolean isSecondaryConnect(GraphAdj g, String srcName, String destName) {
            for (String secondary : g.getConnections(srcName)) {
                if (g.getConnections(secondary).contains(destName)) {
                    return true;
                }
            }
            return false;
        }

        private static boolean isDirectConnect(GraphAdj g, String srcName, String destName) {
            ArrayList<String> connections = g.getConnections(srcName);
            if (connections != null && connections.contains(destName)) {
                return true;
            } else {
                return false;
            }
        }

        private static String getUserInput(GraphAdj g) {
            Scanner scanner = new Scanner(System.in);
            String node;
            do {
                System.out.print("Enter a name: ");
                node = scanner.nextLine();
                if (!g.isNode(node)) {
                    System.out.println("Node not found in the graph. Please try again.");
                }
            } while (!g.isNode(node));
            return node;
        }

        private static GraphAdj createGraph() {
            GraphAdj g = new GraphAdj();
            g.addNode("Alice");
            g.addNode("Bob");
            g.addNode("Carol");
            g.addEdge("Alice", "Bob");
            g.addEdge("Bob", "Carol");
            g.addEdge("Alice", "Carol");  // Example tertiary connection via intermediate node
            return g;
        }

    }


