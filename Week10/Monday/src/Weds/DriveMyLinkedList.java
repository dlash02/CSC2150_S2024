package Weds;

public class DriveMyLinkedList {
    public static void main(String[] args) {
        MyLinkedList mll = new MyLinkedList();
        mll.addNode("Apples");
        mll.addNode("Baker");
        mll.addNode("Charlie");
        mll.addNode("Dog");
        System.out.printf("MLL Size:%s", mll.size );
        mll.showList();

        mll.addNodeAtEnd("Blah");
        System.out.printf("\n ----------------");
        mll.showList();
//        Node item = mll.remoteThisItem( "Dog");
//        System.out.printf("\n ---- Showing ---");
//        mll.showList();
//        System.out.printf("\n Deleted Item:%s and this is%s", item.value, item.next.value);
//
//        if ( mll.contains("Dog")){
//            System.out.printf("\n Yes we have Dog");
//        } else {
//            System.out.printf("\n NO Dog for you");
//        }
//        Node firstN = new Node("Happy");
//        Node secondN = new Node("Sleepy");
//        firstN.next = secondN;
//
//        Node thirdN = new Node("Doc");
//        secondN.next = thirdN;
//
//        Node fourthN = new Node( "Dopey");
//        thirdN.next = fourthN;
//
//        System.out.printf("\n FirstNode=%s", firstN.value);
//        Node nextOne = firstN.next;
//        System.out.printf("\n SecondNode=%s", nextOne.value);
//
//        System.out.printf("\n----------------------");
//        showMeTheList( firstN );
    }

    private static void showMeTheList(Node firstN) {
        Node theNode = firstN;
        while( theNode.next != null ){
            System.out.printf("\n N:%s", theNode.value);
            theNode = theNode.next;
        }
        System.out.printf("\n Last:%s", theNode.value );
    }
}
