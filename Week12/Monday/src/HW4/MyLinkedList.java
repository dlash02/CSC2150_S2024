package HW4;

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
    public void addNodeAtFront( String str, double cost ){
        // ToDo: Deal with cost
        int position = 0; // toDo Need to adjust position
        if ( this.size == 0 ){
            // There are no nodes yet
            head = new Node( str, cost );
            head.next = null;
            this.size = 1;
        } else {
            Node oldHead = head;
            this.head = new Node( str, cost);
            this.head.next = oldHead;
            size++;
        }
    }
    public void addNodeAtEnd( String str, double cost ){
        boolean gotIt = false;
        Node theNode = this.head;
        int position = 0;  // toDo Need to adjust position
        Node previousNode = null;
        while( theNode != null ) {
            previousNode = theNode;
            theNode = theNode.next;
        }
        Node newNode = new Node(str, cost);
        previousNode.next = newNode;
//        System.out.printf("\n At the end previous=%s", previousNode.value);

    }
    public void showList(){
        Node theNode = head;
        int ct = 0;
        //ToDo: Dont forget to output cost too
        while ( theNode != null ){
            System.out.printf("\n Ct:%s Node:%s", ct++, theNode.value);
            theNode = theNode.next;
        }

    }
    public Node removeThisItem( String item ){
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
