package Prep;

import java.util.*;

public class GraphHashDriver {
    public static void main(String[] args) {

        GraphHash g = createGraph();

        showAdjVertices( g, "Bob");

        showAdjVertices( g, "Alice");

        showAdjVertices( g, "Mark");

        showAdjVertices( g, "Rob");

        showAdjVertices( g, "Maria");

        String root = "Bob";
        LinkedHashSet<String> dfTravSet = depthFirstTraversal(g,  root);

        System.out.printf( "\n- Depth First Traversal ");
        for ( String item : dfTravSet) {
            System.out.printf( "\n---- Item:%s", item);
        }
        LinkedHashSet<String> bfTrav = breadthFirstTraversal(g , root);

        System.out.printf( "\n- Breadth First Traversal ");
        for ( String item : bfTrav ) {
            System.out.printf( "\n---- Item:%s", item);
        }
    }

    private static void showAdjVertices(GraphHash g, String label ) {
        System.out.printf("\n --- Showing Adjacent Vertices of Label:%s", label);
        ArrayList<String> gv = g.getAdjVertices( label );
        for (String item : gv ) {
            System.out.printf("\n --- ---Item: %s", item );
        }
    }

    public  static GraphHash createGraph() {
        GraphHash graph = new GraphHash();
        graph.addVertex("Bob");
        graph.addVertex("Alice");
        graph.addVertex("Mark");
        graph.addVertex("Rob");
        graph.addVertex("Maria");
        graph.addEdge("Bob", "Alice");
        graph.addEdge("Bob", "Rob");
        graph.addEdge("Alice", "Mark");
        graph.addEdge("Rob", "Mark");
        graph.addEdge("Alice", "Maria");
        graph.addEdge("Rob", "Maria");
        return graph;
    }
    public static LinkedHashSet<String> depthFirstTraversal(GraphHash graph, String root) {
        LinkedHashSet<String> visited = new LinkedHashSet<String>();
        Stack<String> stack = new Stack<String>();
        stack.push(root);
        while (!stack.isEmpty()) {
            String vertex = stack.pop();
            if (!visited.contains(vertex)) {
                visited.add(vertex);
                for (String label : graph.getAdjVertices(vertex)) {
                    stack.push(label);
                }
            }
        }
        return visited;
    }
    public static LinkedHashSet<String> breadthFirstTraversal(GraphHash graph, String root) {
        //breadth-first traversal ueses a Queue
        //      to store the vertices which need to be traversed.
        LinkedHashSet<String> visited = new LinkedHashSet<String>();
        Queue<String> queue = new LinkedList<String>();
        queue.add(root);
        visited.add(root);
        while (!queue.isEmpty()) {
            String vertex = queue.poll();
            for (String label : graph.getAdjVertices(vertex)) {
                if (!visited.contains(label)) {
                    visited.add(label);
                    queue.add(label);
                }
            }
        }
        return visited;
    }
}
