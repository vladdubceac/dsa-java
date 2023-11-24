package linked_list.singly_linked_list;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.createSinglyLinkedList(5);
        System.out.println(sll.getHead().getValue());
        sll.insertInLinkedList(6,1);
        sll.insertInLinkedList(7,3);
        System.out.println(sll.getHead().getNext().getNext().getValue());
    }
}
