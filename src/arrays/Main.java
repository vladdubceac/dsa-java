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

        // All together

        String sArray[] = {"a","b","c"};
        System.out.println(Arrays.toString(sArray));

        SingleDimensionArray sda = new SingleDimensionArray(10);
        sda.insert(0,0);
        sda.insert(1,10);
        sda.insert(2,20);
        sda.insert(1,30);
        sda.insert(12,120);
    }
}
