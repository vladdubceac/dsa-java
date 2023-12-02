package linked_list.circular_doubly_linked_list;

public class CircularDoublyLinkedList {
    private DoublyNode head;
    private DoublyNode tail;
    private int size;

    // Create CDLL
    DoublyNode createCDLL(int nodeValue){
        DoublyNode newNode = new DoublyNode();
        newNode.setValue(nodeValue);
        head = newNode;
        tail = newNode;
        newNode.setNext(newNode);
        newNode.setPrev(newNode);
        size = 1;
        return newNode;
    }

    public DoublyNode getHead() {
        return head;
    }

    public void setHead(DoublyNode head) {
        this.head = head;
    }

    public DoublyNode getTail() {
        return tail;
    }

    public void setTail(DoublyNode tail) {
        this.tail = tail;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
