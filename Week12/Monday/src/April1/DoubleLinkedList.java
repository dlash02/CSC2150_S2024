package April1;

public class DoubleLinkedList {
    Node head, tail = null;
    private int size = 0;
    public void addNode( String value ){
        Node newNode = new Node( value );
        size++;
        if ( head == null ){
            // Adding first element
            head = newNode;
            tail = newNode;
            tail.setNext(null);
            head.setPrevious(null);
        } else {
            tail.setNext( newNode );
            newNode.setPrevious(tail);
            tail = newNode;
            tail.setNext(null);
        }
    }
    public int getSize(){
        // return the current number of nodes in DLL
        return size;
    }
    public void addAtStart( String value ){
        // Prepend this node at the start of DLL
        size++;
        Node newNode = new Node( value );
        if ( head == null ) {
            // Adding first element
            head = newNode;
            tail = newNode;
            tail.setNext(null);
            head.setPrevious(null);
        } else {
            newNode.setNext(head);
            newNode.setPrevious(null);
            head = newNode;
        }
    }
    public void printNodes(){
        Node current = head;
        if ( head == null ){
            System.out.printf("\n Empty Double Linked List ");
            return;
        }
        System.out.printf("\n ---DLL Nodes ");
        while( current != null ){
            System.out.printf("\nV:%s", current.getValue());
            current = current.getNext();
        }
    }
}
