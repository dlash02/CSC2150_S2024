package Prep.BFS;

public class DriveGraphDirectedAdjMatrix {
    public static void main(String[] args) {
        GraphDirectedAdjMatrix gdam = new GraphDirectedAdjMatrix(5);
        gdam.addNode(0, "Detroit");
        gdam.addNode(1, "New York");
        gdam.addNode(2, "Chicago");
        gdam.addNode(3, "Dallas");
        gdam.addNode(4, "Houston");
        gdam.addConnect(0,1);
        gdam.addConnect(0,2);
        gdam.addConnect(1,3);
        gdam.addConnect(1,2);
        gdam.addConnect(3,4);
        gdam.showMatrix();
        gdam.showDirectConnect(0);
    }
}
