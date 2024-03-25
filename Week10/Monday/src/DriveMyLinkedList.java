public class DriveMyLinkedList {
    public static void main(String[] args) {
        Node firstN = new Node("Happy");
        Node secondN = new Node("Sleepy");
        firstN.next = secondN;

        Node thirdN = new Node("Doc");
        secondN.next = thirdN;

        Node fourthN = new Node( "Dopey");
        thirdN.next = fourthN;

        System.out.printf("\n FirstNode=%s", firstN.value);
        Node nextOne = firstN.next;
        System.out.printf("\n SecondNode=%s", nextOne.value);

        System.out.printf("\n----------------------");
        showMeTheList( firstN );
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
