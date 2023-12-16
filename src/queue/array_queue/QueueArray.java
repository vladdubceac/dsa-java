package queue.array_queue;

public class QueueArray {
    int[] arr;
    int topOfQueue;
    int beginningOfQueue;

    public QueueArray(int size) {
        this.arr = new int[size];
        this.topOfQueue = -1;
        this.beginningOfQueue = -1;
        System.out.println("The Queue is successfully created with size of " + size);
    }

    public boolean isFull() {
        return topOfQueue == arr.length - 1;
    }

    public boolean isEmpty() {
        return beginningOfQueue == -1 || beginningOfQueue == arr.length;
    }

    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("The queue is full !");
        } else if (isEmpty()) {
            beginningOfQueue = 0;
            topOfQueue++;
            arr[topOfQueue] = value;
            System.out.println("Successfully inserted " + value + " in the queue!");
        } else {
            topOfQueue++;
            arr[topOfQueue] = value;
            System.out.println("Successfully inserted " + value + " in the queue!");
        }
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("The queue is empty ! ");
            return Integer.MIN_VALUE;
        } else {
            int result = arr[beginningOfQueue];
            beginningOfQueue++;
            if (beginningOfQueue > topOfQueue) {
                beginningOfQueue = topOfQueue = -1;
            }
            return result;
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("The queue is empty ! ");
            return Integer.MIN_VALUE;
        } else {
            return arr[beginningOfQueue];
        }
    }

    public void delete() {
        topOfQueue = beginningOfQueue = -1;
        arr = null;
        System.out.println("The queue deleted successfully ! ");
    }
}
