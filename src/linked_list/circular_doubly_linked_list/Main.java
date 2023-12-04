package linked_list.circular_doubly_linked_list;

public class Main {
    public static void main(String[] args) {
        CircularDoublyLinkedList cdll = new CircularDoublyLinkedList();
        cdll.createCDLL(1);
        cdll.insertNode(2,1);
        System.out.println(cdll.getHead().getValue());
        System.out.println(cdll.getHead().getNext().getValue());
    }
}
