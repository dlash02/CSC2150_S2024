package April8;

public class BST {
    BSTNode root = null;

//    public BST() {
//    }
    public void addNode( int key, String name ){
        BSTNode bstNode = new BSTNode( key, name);
        if ( root == null ){
            root = bstNode;
        } else {
            // Not my first node
            BSTNode focusNode = root;
            BSTNode parent = null;
            while( true ){
                parent = focusNode;
                if ( key < focusNode.key){
                    // to the left to the left
                    focusNode = focusNode.leftChild;
                    if ( focusNode == null ){
                        parent.leftChild = bstNode;
                        return;
                    }
                } else {
                    // to the right to the right
                    focusNode = focusNode.rightChild;
                    if ( focusNode == null ){
                        parent.rightChild = bstNode;
                        return;
                    }
                }
            }
        }
    }
}
