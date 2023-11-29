package linked_list.circular_singly_linked_list;

public class Main {
    public static void main(String[] args) {
        CircularSinglyLinkedList csll = new CircularSinglyLinkedList();
        csll.createCSLL(5);
        csll.insertCSLL(4,0);
        csll.insertCSLL(6,1);
        csll.insertCSLL(7,8);
//        System.out.println(csll.getHead().getValue());
//        System.out.println(csll.getHead().getNext().getValue());
//        System.out.println(csll.getTail().getValue());
//        System.out.println(csll.getSize());
        csll.traversalCSLL();
//        csll.searchNode(5);
//        csll.searchNode(10);

//        csll.deleteNode(0);
//        csll.deleteNode(8);
        csll.deleteNode(2);
        csll.traversalCSLL();

        csll.deleteCSLL();
        csll.traversalCSLL();
    }
}
