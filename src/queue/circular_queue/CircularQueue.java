package queue.circular_queue;

public class CircularQueue {
    int[] arr;
    int topOfQueue;
    int beginningOfQueue;
    int size;

    public CircularQueue(int size) {
        this.arr = new int[size];
        this.size = size;
        this.topOfQueue = -1;
        this.beginningOfQueue = -1;
        System.out.println("The Circular Queue is successfully created with size of " + size);
    }

    // isEmpty
    public boolean isEmpty() {
        return topOfQueue == -1;
    }

    // isFull
    public boolean isFull() {
        if (topOfQueue + 1 == beginningOfQueue || (beginningOfQueue == 0 && topOfQueue + 1 == size)) {
            return true;
        } else {
            return false;
        }
    }

    // enQueue
    public void enQueue(int value) {
        if (isFull()) {
            System.out.println("The CQ is full");
            return;
        } else if (isEmpty()) {
            beginningOfQueue = 0;
            topOfQueue++;
            arr[topOfQueue] = value;
        } else {
            if (topOfQueue + 1 == size) {
                topOfQueue = 0;
            } else {
                topOfQueue++;
            }
            arr[topOfQueue] = value;
        }
        System.out.println("Successfully inserted " + value + " in the queue");
    }
}
