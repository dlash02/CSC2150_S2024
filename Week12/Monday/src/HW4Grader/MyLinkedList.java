package HW4Grader;

import java.util.ArrayList;
import java.util.LinkedList;

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
            System.out.printf("\n Ct: %s\tNode: %s\tCost: $%s", ct++, theNode.value, theNode.cost);
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

    public void reverseTheList() {
//        maybe: while loop, put in array list, then put back in linked list in reverse order
//        arrayList<Node> ????

        Node theHead = head;
        Node previous = null;
        Node current = null;

        while (theHead != null) {
            current = theHead;
            theHead = theHead.next;

            current.next = previous;
            previous = current;
            head = current;
        }
    }

    public void removeMostExpensive() {
        Node theHead = head;
        Node previous = null;
        Node current = null;
        double min = Double.MIN_VALUE;
        Node max = null;

        while (theHead != null){
            if (theHead.cost > min) {
                max = theHead;
                theHead = theHead.next;
            }
        }
        removeThisItem(max.value);
    }
}
