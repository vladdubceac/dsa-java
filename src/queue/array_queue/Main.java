package queue.array_queue;

public class Main {
    public static void main(String[] args) {
        QueueArray queueArray = new QueueArray(3);
//        System.out.println("Is queue full ? "+queueArray.isFull());
//        System.out.println("Is queue empty ? "+queueArray.isEmpty());
        queueArray.enqueue(1);
        queueArray.enqueue(2);
        queueArray.enqueue(3);
        queueArray.enqueue(4);
    }
}
