import java.nio.charset.IllegalCharsetNameException;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[][] adjMat = createTheGraph();
        HashMap< String, Integer> vertName = getVertice();
        String interest = "Chicago";
        int row = vertName.get(interest);
        int connections[] = adjMat[row];
        for ( int i = 0; i < connections.length; i++ ) {
            System.out.printf("\n i%s con:%s", i, connections[i]);
        }
        showTheConnects( interest, connections, vertName);
    }

    private static void showTheConnects(String interest, int[] connections,
                                         HashMap<String, Integer> vertName) {
        HashMap<Integer, String> byIndex = new HashMap<>();
        for( String key : vertName.keySet()) {
            byIndex.put(vertName.get(key), key);
        }
        for( int i = 0; i < connections.length; i++ ) {
            if ( connections[i] == 1 ){
                System.out.printf("\n Name:%s", byIndex.get(i));
            }
        }
        //ToDo: Output code that says:
        // Chicago is connected to Denver, Dallas Orlando
    }

    private static HashMap<String, Integer> getVertice() {
        HashMap<String, Integer> vertName = new HashMap<>();
        vertName.put("Chicago", 0);
        vertName.put("Denver", 1);
        vertName.put("St Louis", 2);
        vertName.put("Dallas", 3);
        vertName.put("Orlando", 4);

        //----

        return vertName;
    }

    private static int[][] createTheGraph() {
        int[][] adjMat = new int[5][5];
        // set node 0 - chicago
        adjMat[0][0] = 0;
        adjMat[0][1] = 1;
        adjMat[0][2] = 0;
        adjMat[0][3] = 1;
        adjMat[0][4] = 1;
        // set node 1- Denver
        adjMat[1][0] = 0;
        adjMat[1][1] = 0;
        adjMat[1][2] = 1;
        adjMat[1][3] = 0;
        adjMat[1][4] = 0;
        // set node 1- Denver
        adjMat[2][0] = 0;
        adjMat[2][1] = 0;
        adjMat[2][2] = 0;
        adjMat[2][3] = 1;
        adjMat[2][4] = 1;
        // set node 3
        adjMat[3][0] = 0;
        adjMat[3][1] = 0;
        adjMat[3][2] = 0;
        adjMat[3][3] = 0;
        adjMat[3][4] = 1;
        // set node 4
        adjMat[4][0] = 0;
        adjMat[4][1] = 0;
        adjMat[4][2] = 0;
        adjMat[4][3] = 0;
        adjMat[4][4] = 0;
        return adjMat;
    }
}