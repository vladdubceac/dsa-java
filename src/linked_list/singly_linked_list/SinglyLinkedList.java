package linked_list.singly_linked_list;

public class SinglyLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public Node createSinglyLinkedList(int nodeValue) {
        head = new Node();
        Node node = new Node();
        node.setNext(null);
        node.setValue(nodeValue);
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    // Insert Method SinglyLinkedList
    public void insertInLinkedList(int nodeValue, int location) {
        Node node = new Node();
        node.setValue(nodeValue);
        if (head == null) {
            createSinglyLinkedList(nodeValue);
            return;
        }else if(location==0){
            node.setNext(head);
            head = node;
        }else if(location>=size){
            node.setNext(null);
            tail.setNext(node);
            tail = node;
        }else{
            Node tempNode = head;
            int index = 0;
            while(index <location-1){
                tempNode = tempNode.getNext();
                index++;
            }
            Node nextNode = tempNode.getNext();
            tempNode.setNext(node);
            node.setNext(nextNode);
        }
        size++;
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
