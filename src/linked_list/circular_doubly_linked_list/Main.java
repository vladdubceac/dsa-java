package linked_list.circular_doubly_linked_list;

public class Main {
    public static void main(String[] args) {
        CircularDoublyLinkedList cdll = new CircularDoublyLinkedList();
        cdll.createCDLL(1);
        cdll.insertNode(2,0);
        cdll.insertNode(3,2);
        cdll.insertNode(4,5);
//        System.out.println(cdll.getHead().getValue());
//        System.out.println(cdll.getHead().getNext().getValue());
        cdll.traverseCDLL();
        cdll.reverseTraversalCDLL();
    }
}
