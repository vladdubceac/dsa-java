package search;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,3,2,10,23,11};
        Searching.linearSearch(arr, 10);
        Searching.linearSearch(arr, 20);

        arr =new int[]{8, 9, 12, 15, 17, 19, 20, 21, 28};
        Searching.binarySearch(arr, 15);
        Searching.binarySearch(arr, 18);
    }
}
