package linked_list.doubly_linked_list;

public class DoublyLinkedList {
    private DoublyNode head;
    private DoublyNode tail;
    private int size;

    public DoublyNode createDLL(int nodeValue) {
        DoublyNode newNode = new DoublyNode();
        newNode.setValue(nodeValue);
        newNode.setNext(null);
        newNode.setPrev(null);
        head = newNode;
        tail = newNode;
        size = 1;
        return head;
    }

    // Insertion Method
    public void insertDLL(int nodeValue, int location) {
        DoublyNode newNode = new DoublyNode();
        newNode.setValue(nodeValue);
        if (head == null) {
            createDLL(nodeValue);
            return;
        } else if (location == 0) {
            newNode.setPrev(null);
            newNode.setNext(head);
            head.setPrev(newNode);
            head = newNode;
        } else if (location >= size) {
            newNode.setNext(null);
            tail.setNext(newNode);
            newNode.setPrev(tail);
            tail = newNode;
        } else {
            DoublyNode tempNode = head;
            int index = 0;
            while (index < location - 1) {
                tempNode = tempNode.getNext();
                index++;
            }
            newNode.setPrev(tempNode);
            newNode.setNext(tempNode.getNext());
            tempNode.setNext(newNode);
            newNode.getNext().setPrev(newNode);
        }
        size++;

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
