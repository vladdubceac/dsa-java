package linked_list.circular_doubly_linked_list;

public class Main {
    public static void main(String[] args) {
        CircularDoublyLinkedList cdll = new CircularDoublyLinkedList();
        cdll.createCDLL(1);
        cdll.insertNode(2,0);
        cdll.insertNode(3,2);
        cdll.insertNode(4,5);
        cdll.insertNode(5,3);
        cdll.insertNode(0,4);
        cdll.insertNode(-1,6);
//        System.out.println(cdll.getHead().getValue());
//        System.out.println(cdll.getHead().getNext().getValue());
//        cdll.reverseTraversalCDLL();
//        cdll.searchNode(3);
//        cdll.searchNode(9);
        cdll.traverseCDLL();
        cdll.deleteNode(0);
        cdll.traverseCDLL();
        cdll.deleteNode(6);
        cdll.traverseCDLL();
        cdll.deleteNode(2);
        cdll.traverseCDLL();
        cdll.deleteCDLL();
        cdll.traverseCDLL();
    }
}
