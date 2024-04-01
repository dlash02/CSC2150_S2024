package Weds;

public class MyLinkedList {
    Node head = null;
    public int size = 0;
    public MyLinkedList(){
        this.head = null;
        this.size = 0;
    }
    public int getSize() {
        return this.size;
    }
    public void addNode( String str ){
        if ( this.size == 0 ){
            // There are no nodes yet
            head = new Node( str );
            head.next = null;
            this.size = 1;
        } else {
            Node oldHead = head;
            this.head = new Node( str);
            this.head.next = oldHead;
            size++;
        }
    }
    public void addNodeAtEnd( String str ){
        boolean gotIt = false;
        Node theNode = this.head;
        Node previousNode = null;
        while( theNode != null ) {
            previousNode = theNode;
            theNode = theNode.next;
        }
        Node newNode = new Node(str);
        previousNode.next = newNode;
//        System.out.printf("\n At the end previous=%s", previousNode.value);

    }
    public void showList(){
        Node theNode = head;
        int ct = 0;
        while ( theNode != null ){
            System.out.printf("\n Ct:%s Node:%s", ct++, theNode.value);
            theNode = theNode.next;
        }

    }
    public Node remoteThisItem( String item ){
        boolean gotIt = false;
        Node theNode = this.head;
        Node previousNode = null;

        while( theNode != null ){
            if ( theNode.value.equals(item)){
                if ( previousNode == null ){
                    // Then found it at first position
                    this.size--;
                    this.head = theNode.next;
                    return theNode;
                } else {
                    // Not the first node
                    this.size--;
                    previousNode.next = theNode.next;
                    return theNode;
                }
            } else {
                // Did not find it yet
                previousNode = theNode;
                theNode = theNode.next;
            }
        }
        return null;
    }
    public boolean contains( String item ){
        boolean gotIt = false;
        Node theNode = this.head;
        while( theNode != null ) {
            if (theNode.value.equals(item)) {
                return true;
            }
            theNode = theNode.next;
        }
        return gotIt;
    }

}
