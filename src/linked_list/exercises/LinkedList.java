package linked_list.exercises;

import java.util.HashSet;
import java.util.Set;

public class LinkedList {
    private Node head;
    private Node tail;
    private int size;

    public LinkedList() {
    }

    public LinkedList(int size, Node head, Node tail) {
        this.head = head;
        this.tail = tail;
        this.size = size;
    }

    public void createLL(int nodeValue) {
        Node newNode = new Node();
        newNode.setValue(nodeValue);
        newNode.setNext(null);
        head = newNode;
        tail = newNode;
        size = 1;
    }

    public void insertNode(int nodeValue) {
        if (head == null) {
            createLL(nodeValue);
            return;
        }

        Node newNode = new Node();
        newNode.setValue(nodeValue);
        newNode.setNext(null);
        if(tail==null){
            tail = new Node();
        }
        tail.setNext(newNode);
        tail = newNode;
        size++;
    }

    public void traversalLL() {
        Node tempNode = head;
        for (int i = 0; i < size; i++) {
            System.out.print(tempNode.getValue());
            if (i != size - 1) {
                System.out.print(" -> ");
            }
            tempNode = tempNode.getNext();
        }
        System.out.println();
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public int getSize() {
        return size;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }

    public void decreaseSize() {
        size--;
    }
}
