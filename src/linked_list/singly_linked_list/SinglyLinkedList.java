package linked_list.singly_linked_list;

public class SinglyLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public Node createSinglyLinkedList(int nodeValue){
        head = new Node();
        Node node = new Node();
        node.setNext(null);
        node.setValue(nodeValue);
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getTail() {
        return tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
