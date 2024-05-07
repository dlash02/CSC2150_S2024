package April17;

public class DriveSimpAdjMatrix {
    public static void main(String[] args) {
        Graph g = new Graph( 4);
        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(0,3);
        g.addEdge(1,2);
        System.out.printf("\n The Graph:%s", g.toString());

        Graph g2 = new Graph(5);
        g2.addEdgeDirected(0,3 );
        g2.addEdgeDirected(0,2);
        g2.addEdgeDirected(1,0);
        g2.addEdgeDirected(2,1);
        g2.addEdgeDirected(2,4);
        g2.addEdgeDirected(3,4);
        System.out.printf("\n The Graph2:%s", g2.toString());


        boolean[] theRow = g2.getConnectedTo(0);


        System.out.printf("\n The Row 0 is connected to:");
        for( boolean b : theRow){
            if ( b ){
                System.out.printf("1 ");
            } else {
                System.out.printf("0 ");
            }
        }
        System.out.printf("\n Is 0 connected to 3:%s", g2.isConnection(0,3));
    }
}
