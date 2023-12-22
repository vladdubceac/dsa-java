package queue.linked_list_queue;

public class QueueLinkedList {
    LinkedList list;

    public QueueLinkedList() {
        list = new LinkedList();
        System.out.println("The Queue is successfully created");
    }

    // isEmpty
    public boolean isEmpty() {
        return list.head == null;
    }

    //enQueue
    public void enQueue(int value) {
        list.insertInLinkedList(value, list.size);
        System.out.println("Successfully inserted " + value + " in the queue");
    }

    // deQueue
    public int deQueue() {
        int value = -1;
        if (isEmpty()) {
            System.out.println("The Queue is empty");
        } else {
            value = list.head.value;
            list.deletionOfNode(0);
        }
        return value;
    }

    // peek
    public int peek() {
        if (isEmpty()) {
            System.out.println("The queue is empty");
            return -1;
        } else {
            return list.head.value;
        }
    }

    // delete
    public void delete() {
        list.head = null;
        list.tail = null;
        System.out.println("The queue is successfully deleted ! ");
    }
}
