package queue.linked_list_queue;

public class Main {
    public static void main(String[] args) {
        QueueLinkedList newQLL = new QueueLinkedList();
        newQLL.enQueue(10);
        newQLL.enQueue(20);
        newQLL.enQueue(30);
        boolean isEmpty = newQLL.isEmpty();
        System.out.println("is empty - "+isEmpty);

        int result = newQLL.peek();
        System.out.println(result);
        int result1 = newQLL.peek();
        System.out.println(result1);

        newQLL.delete();
    }
}
