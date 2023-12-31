package arrays.two_dimensional;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /*// Step 1 - Declare
        int[][] int2DArray;
        // Step 2 - Instantiate
        int2DArray = new int[2][2];
        // Step 3 - Initialize
        int2DArray[0][0] = 1;
        int2DArray[0][1] = 2;
        int2DArray[1][0] = 3;
        int2DArray[1][1] = 4;

        System.out.println(Arrays.deepToString(int2DArray));

        // All together
        String s2DArray[][] = {{"a","b"},{"c","d"}};

        System.out.println(Arrays.deepToString(s2DArray));*/

        TwoDimensionalArray sda = new TwoDimensionalArray(3, 3);
        sda.insertValueInTheArray(0, 0, 10);
        sda.insertValueInTheArray(0, 1, 20);
        sda.insertValueInTheArray(1, 0, 30);
        sda.insertValueInTheArray(2, 0, 40);
//        sda.accessCell(0,1);
//        sda.traverse2DArray();
//        sda.searchingValue(20);
//        sda.searchingValue(50);

        System.out.println(Arrays.deepToString(sda.arr));
        sda.deleteValue(0,0);
        System.out.println(Arrays.deepToString(sda.arr));
    }
}
