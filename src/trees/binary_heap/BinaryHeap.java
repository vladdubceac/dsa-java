package trees.binary_heap;

public class BinaryHeap {
    int arr[];
    int sizeOfTree;

    public BinaryHeap(int size) {
        arr = new int[size + 1];
        this.sizeOfTree = 0;
        System.out.println("Binary Heap has been created");
    }

    public boolean isEmpty() {
        return sizeOfTree == 0;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Binary Heap is empty !");
            return Integer.MIN_VALUE;
        }
        return arr[1];
    }

    public int sizeOfBP() {
        return sizeOfTree;
    }

    public void levelOrder() {
        for (int i = 1; i <= sizeOfTree; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
    }

    // Heapify for insert
    public void heapifyBottomToTop(int index, HeapType heapType) {
        int parent = index / 2;
        if (index <= 1) {
            return;
        }
        if (heapType == HeapType.MIN) {
            if (arr[index] < arr[parent]) {
                int tmp = arr[index];
                arr[index] = arr[parent];
                arr[parent] = tmp;
            }
        } else if (heapType == HeapType.MAX) {
            if (arr[index] > arr[parent]) {
                int tmp = arr[index];
                arr[index] = arr[parent];
                arr[parent] = tmp;
            }
        }
        heapifyBottomToTop(parent, heapType);
    }

    public void insert(int value, HeapType heapType) {
        arr[sizeOfTree + 1] = value;
        sizeOfTree++;
        heapifyBottomToTop(sizeOfTree, heapType);
        System.out.println("Inserted " + value + " successfully in the binary heap !");
    }

    // heapifyTopToBottom
    public void heapifyTopToBottom(int index, HeapType heapType) {
        int left = index * 2;
        int right = index * 2 + 1;
        int swapChild = -1;
        if (sizeOfTree < left) {
            return;
        }
        if (heapType == HeapType.MAX) {
            if (sizeOfTree == left) {
                if (arr[index] < arr[left]) {
                    int tmp = arr[index];
                    arr[index] = arr[left];
                    arr[left] = tmp;
                }
                return;
            } else {
                if (arr[left] > arr[right]) {
                    swapChild = left;
                } else {
                    swapChild = right;
                }
                if (arr[index] < arr[swapChild]) {
                    int tmp = arr[index];
                    arr[index] = arr[swapChild];
                    arr[swapChild] = tmp;
                }
            }
        } else if (heapType == HeapType.MIN) {
            if (sizeOfTree == left) {
                if (arr[index] > arr[left]) {
                    int tmp = arr[index];
                    arr[index] = arr[left];
                    arr[left] = tmp;
                }
                return;
            } else {
                if (arr[left] < arr[right]) {
                    swapChild = left;
                } else {
                    swapChild = right;
                }
                if (arr[index] > arr[swapChild]) {
                    int tmp = arr[index];
                    arr[index] = arr[swapChild];
                    arr[swapChild] = tmp;
                }
            }
        }
        heapifyTopToBottom(swapChild, heapType);
    }

    public int extractHeadOfBP(HeapType heapType) {
        if (isEmpty()) {
            return Integer.MIN_VALUE;
        } else {
            int extractedValue = arr[1];
            arr[1] = arr[sizeOfTree];
            sizeOfTree--;
            heapifyTopToBottom(1, heapType);
            return extractedValue;
        }
    }
}
