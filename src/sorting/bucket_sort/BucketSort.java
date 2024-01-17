package sorting.bucket_sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BucketSort {
    int arr[];

    public BucketSort(int arr[]) {
        this.arr = arr;
    }

    void printArray() {
        for (int n : arr) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

    // Print Buckets
    public void printBucket(List<Integer>[] buckets) {
        for (int i = 0; i < buckets.length; i++) {
            System.out.print("Bucket #" + i + " : ");
            for (int j = 0; j < buckets[i].size(); j++) {
                System.out.print(buckets[i].get(j) + " ");
            }
            System.out.println();
        }
    }

    // Bucket sort
    public void bucketSort() {
        int numberOfBuckets = (int) Math.ceil(Math.sqrt(arr.length));
        int maxValue = Integer.MIN_VALUE;
        for (int value : arr) {
            if (value > maxValue) {
                maxValue = value;
            }
        }

        ArrayList<Integer>[] buckets = new ArrayList[numberOfBuckets];
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new ArrayList<>();
        }

        for (int value : arr) {
            int bucketNumber = (int) Math.ceil(((float) value * numberOfBuckets) / (float) maxValue);
            buckets[bucketNumber - 1].add(value);
        }

        System.out.println("\nPrinting buckets before sorting... ");
        printBucket(buckets);

        for (ArrayList<Integer> bucket : buckets) {
            Collections.sort(bucket);
        }
        System.out.println("\nPrinting buckets after sorting... ");
        printBucket(buckets);

        int index = 0;
        for (ArrayList<Integer> bucket : buckets) {
            for (int value : bucket) {
                arr[index] = value;
                index++;
            }
        }
    }
}
