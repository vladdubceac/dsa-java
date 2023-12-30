package recursion;

public class ArrayMaxNum {
    public static void main(String[] args) {
        int arr[] = new int[]{8, 11, 4, 12, 7};
        int max = findMaxNumRec(arr, 5);
        System.out.println(max);
    }

    public static int findMaxNumRec(int[] sampleArray, int n) {
        if (n == 1) {
            return sampleArray[0];
        }
        int a = sampleArray[n - 1];
        int b = findMaxNumRec(sampleArray, n - 1);
        return Integer.max(a, b);
    }
}
