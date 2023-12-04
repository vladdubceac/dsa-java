package linked_list.circular_doubly_linked_list;

public class CircularDoublyLinkedList {
    private DoublyNode head;
    private DoublyNode tail;
    private int size;

    // Create CDLL
    DoublyNode createCDLL(int nodeValue) {
        DoublyNode newNode = new DoublyNode();
        newNode.setValue(nodeValue);
        head = newNode;
        tail = newNode;
        newNode.setNext(newNode);
        newNode.setPrev(newNode);
        size = 1;
        return newNode;
    }

    // Insertion Method
    public void insertNode(int nodeValue, int location) {
        DoublyNode newNode = new DoublyNode();
        newNode.setValue(nodeValue);
        if (head == null) {
            createCDLL(nodeValue);
            return;
        } else if (location == 0) {
            newNode.setNext(head);
            newNode.setPrev(tail);
            head.setPrev(newNode);
            tail.setNext(newNode);
            head = newNode;
        } else if (location >= size) {
            newNode.setNext(head);
            newNode.setPrev(tail);
            head.setPrev(newNode);
            tail.setNext(newNode);
            tail = newNode;
        } else {
            DoublyNode tempNode = head;
            for (int index = 0; index < location - 1; index++) {
                tempNode = tempNode.getNext();
            }
            newNode.setPrev(tempNode);
            newNode.setNext(tempNode.getNext());
            tempNode.setNext(newNode);
            newNode.getNext().setPrev(newNode);
        }
        size++;
    }

    // Traverse CDLL
    public void traverseCDLL() {
        if (head != null) {
            DoublyNode tempNode = head;
            for (int i = 0; i < size; i++) {
                System.out.print(tempNode.getValue());
                if (i != size - 1) {
                    System.out.print(" -> ");
                }
                tempNode = tempNode.getNext();
            }
        } else {
            System.out.println("The CDLL does not exist!");
        }
        System.out.println();
    }

    // Reverse traversal
    public void reverseTraversalCDLL() {
        if (head != null) {
            DoublyNode tempNode = tail;
            for (int i = 0; i < size; i++) {
                System.out.print(tempNode.getValue());
                if (i != size - 1) {
                    System.out.print(" <- ");
                }
                tempNode = tempNode.getPrev();
            }
        } else {
            System.out.println("The CDLL does not exist! ");
        }
        System.out.println();
    }

    // Search for a Node
    boolean searchNode(int nodeValue) {
        if (head != null) {
            DoublyNode tempNode = head;
            for (int i = 0; i < size; i++) {
                if (tempNode.getValue() == nodeValue) {
                    System.out.println("The node " + nodeValue + " is found at location: " + i);
                    return true;
                }
                tempNode = tempNode.getNext();
            }
        }
        System.out.println("Node not found ! ");
        return false;
    }

    // Deletion Method
    public void deleteNode(int location) {
        if (head == null) {
            System.out.println("The CDLL does not exist ! ");
            return;
        } else if (location == 0) {
            if (size == 1) {
                head.setPrev(null);
                head.setNext(null);
                head = tail = null;
                size--;
                return;
            }else{
                head = head.getNext();
                head.setPrev(tail);
                tail.setNext(head);
                size--;
            }
        }else if(location>=size){
            if(size==1){
                head.setPrev(null);
                head.setNext(null);
                head = tail = null;
                size--;
                return;
            }else{
                tail = tail.getPrev();
                tail.setNext(head);
                head.setPrev(tail);
                size--;
            }
        }else{
            DoublyNode tempNode = head;
            for(int i=0;i<location-1;i++){
                tempNode = tempNode.getNext();
            }
            tempNode.setNext(tempNode.getNext().getNext());
            tempNode.getNext().setPrev(tempNode);
            size--;
        }
    }

    // Deletion method
    public void deleteCDLL(){
        if(head==null){
            System.out.println("The CDLL does not exist ! ");
        }else{
            DoublyNode node = head;
            int index = 0;
            while(index <size){
                node.setPrev(null);
                node = node.getNext();
                index++;
            }
            head =  null;
            tail = null;
            System.out.println("The CDLL has been deleted ! ");
        }
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
