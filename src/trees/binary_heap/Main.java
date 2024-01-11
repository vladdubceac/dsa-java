package trees.binary_heap;

public class Main {
    public static void main(String[] args) {
        BinaryHeap binaryHeap = new BinaryHeap(5);
        HeapType heapType = HeapType.MAX;
        binaryHeap.insert(10,heapType);
        binaryHeap.insert(5,heapType);
        binaryHeap.insert(15,heapType);
        binaryHeap.insert(1,heapType);
        binaryHeap.levelOrder();
        binaryHeap.extractHeadOfBP(heapType);
        binaryHeap.levelOrder();
    }
}
