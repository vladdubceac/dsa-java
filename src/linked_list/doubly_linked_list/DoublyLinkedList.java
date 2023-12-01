package linked_list.doubly_linked_list;

public class DoublyLinkedList {
    private DoublyNode head;
    private DoublyNode tail;
    private int size;

    public DoublyNode createDLL(int nodeValue){
        DoublyNode newNode = new DoublyNode();
        newNode.setValue(nodeValue);
        newNode.setNext(null);
        newNode.setPrev(null);
        head = newNode;
        tail = newNode;
        size = 1;
        return head;
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
