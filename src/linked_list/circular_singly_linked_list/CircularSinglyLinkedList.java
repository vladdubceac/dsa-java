package linked_list.circular_singly_linked_list;

public class CircularSinglyLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public Node createCSLL(int nodeValue) {
        head = new Node();
        Node node = new Node();
        node.setValue(nodeValue);
        node.setNext(node);
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    // insert
    public void insertCSLL(int nodeValue, int location) {
        Node node = new Node();
        node.setValue(nodeValue);
        if (head == null) {
            createCSLL(nodeValue);
            return;
        } else if (location == 0) {
            node.setNext(head);
            head = node;
            tail.setNext(head);
        } else if (location >= size) {
            tail.setNext(node);
            tail = node;
            tail.setNext(head);
        } else {
            Node tempNode = head;
            int index = 0;
            while (index < location - 1) {
                tempNode = tempNode.getNext();
                index++;
            }
            node.setNext(tempNode.getNext());
            tempNode.setNext(node);
        }
        size++;
    }

    // Traversal method
    public void traversalCSLL() {
        if (head == null) {
            System.out.println("CSSL doesn't exist ! ");
            return;
        } else {
            Node temp = head;
            int index = 0;
            while (index < size) {
                System.out.print(temp.getValue());
                if (index != size - 1) {
                    System.out.print(" -> ");
                }
                temp = temp.getNext();
                index++;
            }
        }
        System.out.println();
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
