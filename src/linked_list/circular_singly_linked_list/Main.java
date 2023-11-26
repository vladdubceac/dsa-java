package linked_list.circular_singly_linked_list;

public class Main {
    public static void main(String[] args) {
        CircularSinglyLinkedList csll = new CircularSinglyLinkedList();
        csll.createCSLL(5);
        System.out.println(csll.getHead().getValue());
        System.out.println(csll.getHead().getNext().getValue());
        System.out.println(csll.getTail().getValue());
        System.out.println(csll.getSize());
    }
}