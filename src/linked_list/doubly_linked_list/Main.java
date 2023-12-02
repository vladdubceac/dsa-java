package linked_list.doubly_linked_list;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.createDLL(1);
        dll.insertDLL(2,0);
        dll.insertDLL(3,1);
        dll.insertDLL(4,7);
        System.out.println(dll.getHead().getValue());
        System.out.println(dll.getHead().getNext().getValue());
        dll.traverseDLL();
    }
}
