package sorting.bucket_sort;

public class Main {
    public static void main(String[] args) {
        int arr[] = {9,8,7,5,4,2,1,3,8};
        BucketSort bs = new BucketSort(arr);
        bs.printArray();
        bs.bucketSort();
        bs.printArray();
    }
}
