package Prep;

public class GraphDirected {
        private boolean adjMatrix[][];
        private int numVertices;
        public GraphDirected(int numVertices) {
            this.numVertices = numVertices;
            adjMatrix = new boolean[numVertices][numVertices];
        }
        public void addEdge(int i, int j) {
            adjMatrix[i][j] = true;
//            adjMatrix[j][i] = true;
        }
        public void removeEdge(int i, int j) {
            adjMatrix[i][j] = false;
//            adjMatrix[j][i] = false;
        }
        public boolean[] getConnectedTo( int item ){
            boolean[] theRow = null;
            int numRows = adjMatrix.length-1;
            if ( item > numRows ){
                System.out.printf("\n Cannot continue item:%s > numRows:%s", item, numRows);
            } else {
                theRow = adjMatrix[item];
            }
            return theRow;
        }

        public String toString() {
            StringBuilder s = new StringBuilder();
            for (int i = 0; i < numVertices; i++) {
                s.append(i + ": ");
                for (boolean j : adjMatrix[i]) {
                    if ( j ){
                        s.append( "1 ");
                    } else {
                        s.append( "0 ");
                    }
                }
                s.append("\n");
            }
            return s.toString();
        }
}
