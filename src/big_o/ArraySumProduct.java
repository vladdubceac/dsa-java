package big_o;

public class ArraySumProduct {
    public static void main(String[] args) {
        int[] customArrray = {1, 2, 3, 4, 5};
        spofArray(customArrray);
    }

    private static void spofArray(int[] array) {
        int sum = 0;
        int product = 1;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        for (int i = 0; i < array.length; i++) {
            product *= array[i];
        }
        System.out.println(sum + " , " + product);
    }
}
