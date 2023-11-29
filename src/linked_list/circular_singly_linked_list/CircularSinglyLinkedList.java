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

    // Search method
    public boolean searchNode(int nodeValue) {
        if (head != null) {
            Node tempNode = head;
            for (int i = 0; i < size; i++) {
                if (tempNode.getValue() == nodeValue) {
                    System.out.println("Found node " + nodeValue + " at location : " + i);
                    return true;
                }
                tempNode = tempNode.getNext();
            }
        }
        System.out.println("Node " + nodeValue + " not found !");
        return false;
    }

    // Delete Method
    public void deleteNode(int location) {
        if (head == null) {
            System.out.println("The CSLL does not exist! ");
            return;
        } else if (location == 0) {
            head = head.getNext();
            tail.setNext(head);
            size--;
            if (size == 0) {
                tail = null;
                head.setNext(null);
                head = null;
            }
        } else if (location >= size) {
            Node tempNode = head;
            for (int i = 0; i < size - 1; i++) {
                tempNode = tempNode.getNext();
            }
            if (tempNode == head) {
                head.setNext(null);
                tail = head = null;
                size--;
                return;
            }
            tempNode.setNext(head);
            tail = tempNode;
            size--;
        } else {
            Node tempNode = head;
            for (int i = 0; i < location - 1; i++) {
                tempNode = tempNode.getNext();
            }
            tempNode.setNext(tempNode.getNext().getNext());
            size--;
        }
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
