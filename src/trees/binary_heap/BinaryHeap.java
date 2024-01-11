package trees.binary_heap;

public class BinaryHeap {
    int arr[];
    int sizeOfTree;

    public BinaryHeap(int size) {
        arr = new int[size+1];
        this.sizeOfTree = 0;
        System.out.println("Binary Heap has been created");
    }

    public boolean isEmpty(){
        return sizeOfTree == 0;
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Binary Heap is empty !");
            return Integer.MIN_VALUE;
        }
        return arr[1];
    }

    public int sizeOfBP(){
        return sizeOfTree;
    }

    public void levelOrder(){
        for(int i=1;i<=sizeOfTree;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println("\n");
    }
}
