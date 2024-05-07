package HW4Grader;

public class DriveMyLinkedList {
    public static void main(String[] args) {
        MyLinkedList mll = new MyLinkedList();
        mll.addNodeAtFront("Apples", 1.99);
        mll.addNodeAtFront("Bananas", 2.99);
        mll.addNodeAtFront("Cake  ", 3.99);
        mll.addNodeAtFront("Donuts", 2.15);
        mll.addNodeAtEnd("Franks", 1.50);
        System.out.printf("MLL Size:%s", mll.size );
        mll.showList();
        System.out.printf("\n\n ----------Removing Donuts----------");
//        //ToDo: Write this method
        mll.removeThisItem("Donuts");
        mll.showList();
        System.out.printf("\n\n ----------Reversing The List----------");
        // ToDo: Write this method
        mll.reverseTheList();
        mll.showList();
        System.out.printf("\n\n ----------Removing Most Expensive----------");
//        // ToDo: Write this Method
        mll.removeMostExpensive();
        mll.showList();
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
