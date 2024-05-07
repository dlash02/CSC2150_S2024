package April15;

public class AdjMAtrix1 {
    public static void main(String[] args) {
        Integer[][] myGraph = new Integer[2][2];

        int[][] myGraph2 = {
                {0,1,0},
                {1,0,1},
                {0,1,0}
        };
        showConnectionFromThisNode( 2, myGraph2 );
    }

    private static void showConnectionFromThisNode(int inNode, int[][] myGraph2) {

        if ( inNode > myGraph2.length-1 || inNode < 0  ){
            System.out.printf("\n Invalid input:%s ", inNode);
        } else {
            int[] theRow = myGraph2[inNode];
            System.out.printf("\n Showing connections for Node:%s", inNode);
            for( int item: theRow){
                if ( item == 1 ) {
                    System.out.printf("\n Connected:%s", item);
                } else {
                    System.out.printf("\n Not Connected:%s", item);
                }
            }

        }
    }
}
