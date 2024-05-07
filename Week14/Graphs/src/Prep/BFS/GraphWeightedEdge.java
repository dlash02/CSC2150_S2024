package Prep.BFS;

public class GraphWeightedEdge {
    private String source;
    private String destination;
    private int weight;

    public GraphWeightedEdge(String source, String destination, int weight) {
        this.source = source;
        this.destination = destination;
        this.weight = weight;
    }

    public String getSource() {
        return source;
    }

    public String getDestination() {
        return destination;
    }

    public int getWeight() {
        return weight;
    }
}
