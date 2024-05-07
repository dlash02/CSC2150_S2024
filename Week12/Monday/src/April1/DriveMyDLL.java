package April1;

public class DriveMyDLL {
    public static void main(String[] args) {
        DoubleLinkedList dll = new DoubleLinkedList();
        dll.addNode("Apples");
        dll.addNode("Bananas");
        dll.addNode("Cake");
        dll.addAtStart("DoNuts");
        dll.printNodes();
        System.out.printf("Size:%s", dll.getSize());
    }
}
