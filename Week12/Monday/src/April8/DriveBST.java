package April8;

import javax.print.attribute.standard.MediaSize;

public class DriveBST {
    public static void main(String[] args) {
        BST myTree = new BST();
        myTree.addNode( 50, "The Boss");
        myTree.addNode( 25, "The VP");
        myTree.addNode( 15, "Office Mgr");
        myTree.addNode( 70, "Sales Manager");
        myTree.addNode( 85, "Sales Person");
        myTree.addNode( 27, "Employee");
        myTree.addNode( 68, "Someone");
        //PReorder Traversal
        // Root LEft right
        preorderTravTree( myTree.root );
        System.out.printf("\n -----------------------");
        inorderTravTree( myTree.root );
        System.out.printf("\n -----------------------");
        postorderTravTree( myTree.root );
    }

    private static void postorderTravTree(BSTNode focusNode) {
        if ( focusNode != null ){
            postorderTravTree( focusNode.leftChild);
            postorderTravTree( focusNode.rightChild);

            System.out.printf("\n focusKey:%s fouValue:%s",focusNode.key, focusNode.name);

        }
    }

    private static void inorderTravTree(BSTNode focusNode) {
        if ( focusNode != null ){
            inorderTravTree( focusNode.leftChild);
            System.out.printf("\n focusKey:%s fouValue:%s",focusNode.key, focusNode.name);

            inorderTravTree( focusNode.rightChild);
        }
    }

    private static void preorderTravTree(BSTNode focusNode ) {
        if ( focusNode != null ){
            System.out.printf("\n focusKey:%s fouValue:%s",focusNode.key, focusNode.name);
            preorderTravTree( focusNode.leftChild);
            preorderTravTree( focusNode.rightChild);
        }
    }

}
