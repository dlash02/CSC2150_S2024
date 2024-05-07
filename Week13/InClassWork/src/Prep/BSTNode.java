package Prep;

public class BSTNode {
    int key;
    String name;
    // BST can only have 1 left and 1 right
    // A little linked lists
    BSTNode leftChild;
    BSTNode rightChild;
    BSTNode( int key, String name) {
        this.key = key;
        this.name = name;
    }
    public String toString(){
        StringBuilder sb = new StringBuilder( "\n - Name:" + name);
        sb.append( " key:" + key);
        return sb.toString();
    }
}
