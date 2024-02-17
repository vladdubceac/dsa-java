package divide_conquer.exercises.count_zeroes;

import java.util.Arrays;

public class Exercise {
    public static int countZeroes(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }
        if (array.length == 1) {
            return array[0] == 0 ? 1 : 0;
        }

        int middleIndex = array.length / 2;

        if (array[middleIndex] == 1) {
            return countZeroes(Arrays.copyOfRange(array, middleIndex, array.length));
        } else {
            int zeroesInFirstHalf = countZeroes(Arrays.copyOfRange(array, 0, middleIndex));

            int zeroesInSecondHalf = countZeroes(Arrays.copyOfRange(array, middleIndex, array.length));
            return zeroesInSecondHalf + zeroesInFirstHalf;
        }
    }

    public static int countZeroes_Method2(int[] array) {
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int middle = (int) (left + right) / 2;
            if (array[middle] == 1) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return array.length - left;
    }

    public static void main(String[] args) {
        int[] array = {1, 1, 1, 1, 0, 0};
        int zeroes = countZeroes_Method2(array);
        System.out.println(Arrays.toString(array) + " has " + zeroes + " zeroes");

        array = new int[]{1, 0, 0, 0, 0};
        zeroes = countZeroes_Method2(array);
        System.out.println(Arrays.toString(array) + " has " + zeroes + " zeroes");

        array = new int[]{0, 0, 0};
        zeroes = countZeroes_Method2(array);
        System.out.println(Arrays.toString(array) + " has " + zeroes + " zeroes");

        array = new int[]{1, 1, 1, 1};
        zeroes = countZeroes_Method2(array);
        System.out.println(Arrays.toString(array) + " has " + zeroes + " zeroes");
    }
}
