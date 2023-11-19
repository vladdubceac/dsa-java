package arrays.exercises.max_product;

public class Solution1 {
//    How to find maximum product of two integers in the array where all elements are positive.
//    Example
//    int[] intArray = {10,20,30,40,50};
//    maxProduct(intArray) // (40,50)

    public static String maxProduct(int[] intArray) {
        // TODO
        int num1 = 1;
        int num2 = 1;
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] * num2 > num1 * num2) {
                num1 = intArray[i];
            }
        }
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] * num1 > num2 * num1 && intArray[i] != num1) {
                num2 = intArray[i];
            }
        }
        return num1 + "," + num2;
    }

    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        System.out.println(maxProduct(array));
    }
}
