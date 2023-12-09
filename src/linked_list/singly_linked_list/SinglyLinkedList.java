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
        } else if (location == 0) {
            node.setNext(head);
            head = node;
        } else if (location >= size) {
            node.setNext(null);
            tail.setNext(node);
            tail = node;
        } else {
            Node tempNode = head;
            int index = 0;
            while (index < location - 1) {
                tempNode = tempNode.getNext();
                index++;
            }
            Node nextNode = tempNode.getNext();
            tempNode.setNext(node);
            node.setNext(nextNode);
        }
        size++;
    }

    // SinglyLinkedList Traversal
    public void traversalSinglyLinkedList() {
        if (head == null) {
            System.out.println("SLL does not exist!");
        } else {
            Node tempNode = head;
            for (int i = 0; i < size; i++) {
                System.out.print(tempNode.getValue());
                if (i != size - 1) {
                    System.out.print(" -> ");
                }
                tempNode = tempNode.getNext();
            }
        }
        System.out.println("\n");
    }

    // Search for a node
    boolean searchNode(int nodeValue) {
        if (head != null) {
            Node tempNode = head;
            for (int i = 0; i < size; i++) {
                if (tempNode.getValue() == nodeValue) {
                    System.out.print("Found the node " + nodeValue + " at location " + i + "\n");
                    return true;
                }
                tempNode = tempNode.getNext();
            }
        }
        System.out.println("Node " + nodeValue + " not found!");
        return false;
    }

    // Deleting a node from SinglyLinkedList
    public void deletionOfNode(int location){
        if(head == null){
            System.out.println("The SLL does not exist");
            return;
        }else if(location==0){
            head = head.getNext();
            size--;
            if(size == 0) {
                tail = null;
            }
        }else if(location>=size){
            Node tempNode = head;
            for(int i = 0; i<size-1; i++){
                tempNode = tempNode.getNext();
            }
            if(tempNode == head){
                tail = head = null;
                size--;
                return;
            }
            tempNode.setNext(null);
            tail = tempNode;
            size--;
        }else{
            Node tempNode =head;
            for(int i=0;i<location-1;i++){
                tempNode = tempNode.getNext();
            }
            tempNode.setNext(tempNode.getNext().getNext());
            size--;
        }
    }

    // Delete entire list
    public void deleteSLL(){
        head=null;
        tail=null;
        System.out.println("The SLL deleted successfully");
    }

    public void push(int nodeValue){
        Node node = new Node();
        node.setValue(nodeValue);
        if(head==null){
            head = node;
            tail = node;
            head.setNext(tail);
            size=1;
            return ;
        }else{
            node.setNext(null);
            tail.setNext(node);
            tail = node;
            size++;
        }
    }

    public Node pop(){
        if(tail==null){
            System.out.println("The SLL does not exist !");
            return null;
        }else if(head==tail){
            Node returned = head;
            head = tail = null;
            size=0;
            return returned;
        }else{
            Node currentNode = head;
            int index = 0;
            while(index<size-1){
                currentNode = currentNode.getNext();
                index++;
            }
            Node returned = currentNode;
            currentNode.setNext(null);
            tail = currentNode;
            size--;
            return returned;
        }
    }

    // Insert
    public boolean insert(int data, int index){
        if(index<0||index>=size){
            return false;
        }
        Node newNode = new Node();
        newNode.setValue(data);
        if(index==0){
            newNode.setNext(head);
            head = newNode;
        }else if(index<size-1){
            int position = 0;
            Node currentNode = head;
            while(position<index-1){
                currentNode = currentNode.getNext();
                position++;
            }
            newNode.setNext(currentNode.getNext());
            currentNode.setNext(newNode);
        }else{
            tail.setNext(newNode);
            tail = newNode;
        }
        size++;
        return true;
    }

    // Get
    public Node get(int index){
        if(head==null){
            System.out.println("The list doesn't exist ");
            return null;
        }else if(index>=size){
            return null;
        }else {
            int position = 0;
            Node currentNode = head;
            while(position<index){
                currentNode = currentNode.getNext();
                position++;
            }
            return currentNode;
        }
    }

    public String rotate(int number) {
        // TODO
        if(size==0){
            return "The list doesn't exist !";
        }
        int count = 0;
        Node temp ;
        while(count < number){
            temp = head;

            head = head.getNext();

            tail.setNext(temp);
            tail = temp;
            tail.setNext(null);
            count++;
        }

        return "Success";
    }

    public boolean set(int index, int value) {
        // TODO
        if(index<0 || index>=size){
            return false;
        }
        if(size == 0){
            push(value);
            return true;
        }

        Node newNode = new Node();
        newNode.setValue(value);
        if(index == 0){
            newNode.setNext(head);
            head = newNode;
            return true;
        }

        int count = 0;

        Node temp = head;
        while(count < index-1){
            temp = temp.getNext();
            count++;
        }
        newNode.setNext(temp.getNext());
        temp.setNext(newNode);
        return true;
    }

    public Node remove(int index) {
        //TODO
        Node deleted = null;
        if(index < 0 || index >= size){
            return null;
        }
        Node temp =  head;
        if(size==1){
            tail = null;
            head = null;
            size = 0;
        }
        for(int i=0;i<index-1;i++){
            temp = temp.getNext();
        }
        deleted = temp.getNext();
        temp.setNext(temp.getNext().getNext());
        size--;
        return deleted;
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
