package arrays;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] intArray;
        intArray = new int[3];
        intArray[0] = 1;
        intArray[1] = 2;
        intArray[2] = 3;
        System.out.println(Arrays.toString(intArray));
        System.out.println("----------");

        // All together
        String sArray[] = {"a", "b", "c"};
        System.out.println(Arrays.toString(sArray));
        System.out.println("----------");

        SingleDimensionArray sda = new SingleDimensionArray(10);
        sda.insert(0, 0);
        sda.insert(1, 10);
        sda.insert(2, 20);
        sda.insert(1,30);
        sda.insert(12,120);
        System.out.println("----------");

        var firstElement = sda.arr[0];
        System.out.println(firstElement);
        var thirdElement = sda.arr[2];
        System.out.println(thirdElement);
        var illegalElement = sda.arr[3];
        System.out.println(illegalElement);
        System.out.println("----------");

        sda.traversalArray();
        System.out.println("----------");

        System.out.println("----------");
        sda.searchInArray(20);
        sda.searchInArray(10);

        sda.deleteValue(0);
        System.out.println(sda.arr[0]);

    }
}
