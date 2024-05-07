package Prep;

public class SimpleAdjMatrix {
        public static void main(String args[]) {
            Graph g = new Graph(4);

            g.addEdge(0, 1);
            g.addEdge(0, 2);
            g.addEdge(1, 2);
//            g.addEdge(2, 0);
            g.addEdge(0, 3);

            System.out.print(g.toString());

            int edge = 1;
            boolean[] theRow = g.getConnectedTo( edge );
            System.out.printf("\n Showing who is connected to Edge:%s", edge);
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
