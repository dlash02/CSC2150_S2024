package Prep;

public class BST {
        public BSTNode root;
        public void addNode( int key, String name ){
            BSTNode newNode = new BSTNode(key, name);
            if ( root == null ){
                root = newNode;
            } else {
                // Not an emptytree
                // start with root
                BSTNode focusNode = root;
                BSTNode parent;
                while (true) {
                    parent = focusNode; // first time thr is root
                    if (key < focusNode.key) {
                        focusNode = focusNode.leftChild;
                        if (focusNode == null) {
                            // leftChild has no children
                            // set parent to newNode
                            parent.leftChild = newNode;
                            return;
                        }
                    } else {
                        // Need to put node on right
                        focusNode = focusNode.rightChild;
                        if (focusNode == null) {
                            parent.rightChild = newNode;
                            return;
                        }
                    }
                }
            }
        }
        public BSTNode findNode( int sKey ) {
            // Idea: Search BST and
            //    return the node if it finds it
            //    return  null if it does not find it
            // So we add nodes and then search by key
            BSTNode focusNode = root;
            while ( focusNode.key != sKey ) {
                if ( sKey < focusNode.key ) {
                    // Search the left child
                    focusNode = focusNode.leftChild;
                } else {
                    focusNode = focusNode.rightChild;
                }
                if ( focusNode == null ){
                    return null;
                }
            }
            return focusNode;
        }
}
