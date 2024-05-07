package Prep;

public class SimpleAdjMatrixDirectedGraph {
        public static void main(String args[]) {
            final int VERTICES = 5;
            GraphDirected g = new GraphDirected(VERTICES );

            g.addEdge(0, 3);
            g.addEdge(0, 2);
            g.addEdge(1, 0);
//            g.addEdge(2, 0);
            g.addEdge(2, 1);
            g.addEdge(3, 4);
            g.addEdge(2, 4);

            System.out.print(g.toString());

            int node = 2;
            boolean[] theRow = g.getConnectedTo( node );
            System.out.printf("\n Showing who is connected to Node:%s", node);
            int edgeCt = 0;
            for( boolean item : theRow){
                if ( item ){
                    System.out.printf("\nEdge:%s Connected ", edgeCt++ );
                } else {
                    System.out.printf("\nEdge:%s Not Connected ", edgeCt++);
                }
            }
        }
    }
