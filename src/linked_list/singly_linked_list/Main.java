package linked_list.singly_linked_list;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.createSinglyLinkedList(5);
//        System.out.println(sll.getHead().getValue());
        sll.insertInLinkedList(6,1);
        sll.insertInLinkedList(7,3);
        sll.insertInLinkedList(8,4);
        sll.insertInLinkedList(9,0);
        sll.traversalSinglyLinkedList();
//        System.out.println(sll.getHead().getNext().getNext().getValue());
        sll.searchNode(7);
        sll.searchNode(10);

        sll.deletionOfNode(3);
        sll.traversalSinglyLinkedList();
        sll.deletionOfNode(0);
        sll.traversalSinglyLinkedList();
        sll.deletionOfNode(sll.getSize());
        sll.traversalSinglyLinkedList();
        sll.deletionOfNode(0);
        sll.traversalSinglyLinkedList();
        sll.deletionOfNode(0);
        sll.traversalSinglyLinkedList();
    }
}
