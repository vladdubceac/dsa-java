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

    // Traversal method
    public void traverseDLL() {
        if (head != null) {
            DoublyNode tempNode = head;
            for (int i = 0; i < size; i++) {
//            while (tempNode != null) {
                System.out.print(tempNode.getValue());
                if (i < size - 1) {
//                if (tempNode != tail) {
                    System.out.print(" -> ");
                }
                tempNode = tempNode.getNext();
            }
        } else {
            System.out.println("DLL does not exist!");
        }
        System.out.println("\n");
    }

    // Reverse traversal method
    public void reverseTraverseDLL(){
        if(head==null){
            System.out.println("DLL does not exist !");
        }else{
            DoublyNode tempNode = tail;
//            while (tempNode!=null){
            for(int i=0;i<size;i++){
                System.out.print(tempNode.getValue());
//                if(tempNode!=head){
                if(i!=size-1){
                    System.out.print(" <- ");
                }
                tempNode = tempNode.getPrev();
            }
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
