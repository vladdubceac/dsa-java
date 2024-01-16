package sorting.bubble_sort;

public class Main {
    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        int arr[] = {10,5,30,15,50,6};
        bubbleSort.bubbleSort(arr);
        bubbleSort.printArray(arr);

    }
}
