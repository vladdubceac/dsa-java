package sorting.merge_sort;

public class Main {
    public static void main(String[] args) {
        int array[] = {10, 3, 2, 5, 8, 4, 3, 1, 2, 9, 7, 8};
        MergeSort.mergeSort(array, 0, array.length - 1);
        MergeSort.printArray(array);
    }
}
