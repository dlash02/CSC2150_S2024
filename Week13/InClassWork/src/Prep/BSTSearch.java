package Prep;

public class BSTSearch {
    public static void main(String[] args) {
        BST theTree = new BST();
        theTree.addNode( 50, "The Boss");
        theTree.addNode( 20, "VP");
        theTree.addNode( 35, "Secretary");
        theTree.addNode( 15, "Office Manager");
        theTree.addNode( 75, "Sales Manager");
        theTree.addNode( 85, "SalesPerson");
        int k = 35;
        BSTNode b = theTree.findNode( k );
        showResult( b, k );

        k = 85;
        b = theTree.findNode( k );
        showResult( b, k );

        k = 185;
        b = theTree.findNode( k );
        showResult( b, k );
    }
    private static void showResult(BSTNode b, int key) {
        if ( b != null ){
            System.out.printf("\n Node Found: %s", b.toString());
        } else {
            System.out.printf("\n Node Not Found: %s", key );
        }
    }
}
