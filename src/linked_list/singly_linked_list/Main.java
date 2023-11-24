package linked_list.singly_linked_list;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.createSinglyLinkedList(5);
        System.out.println(sll.getHead().getValue());
    }
}
