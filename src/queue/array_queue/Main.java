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

        System.out.println("peek = "+queueArray.peek());
        int el = queueArray.dequeue();
        System.out.println("dequeue = " + el);
        System.out.println("\tpeek = "+queueArray.peek());
        System.out.println("\t\tpeek = "+queueArray.peek());
        el = queueArray.dequeue();
        System.out.println("dequeue = " + el);
        System.out.println("\t\tpeek = "+queueArray.peek());
        el = queueArray.dequeue();
        System.out.println("dequeue = " + el);
        System.out.println("\t\tpeek = "+queueArray.peek());
        el = queueArray.dequeue();
        System.out.println("dequeue = " + el);
        System.out.println("---------------");
        queueArray.delete();
        queueArray.peek();
        queueArray.dequeue();
        queueArray.enqueue(23);
        System.out.println("new peek = "+queueArray.peek());
        System.out.println("new enqueue = "+queueArray.dequeue());
    }
}
