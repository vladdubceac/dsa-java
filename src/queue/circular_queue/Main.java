package queue.circular_queue;

public class Main {
    public static void main(String[] args) {
        CircularQueue cq = new CircularQueue(3);
        boolean result = cq.isEmpty();
        System.out.println(result);
        result = cq.isFull();
        System.out.println(result);
        System.out.println("---------------");
        CircularQueue newCQ = new CircularQueue(3);
        newCQ.enQueue(10);
        newCQ.enQueue(20);
        newCQ.enQueue(30);
        newCQ.enQueue(40);
    }
}
