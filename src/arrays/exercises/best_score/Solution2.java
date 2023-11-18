package arrays.exercises.best_score;

import java.util.Arrays;

public class Solution2 {
    public static int[] findTopTwoScores(int[] array) {
        int firstHighest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        for (int score : array) {
            if (score > firstHighest) {
                secondHighest = firstHighest;
                firstHighest = score;
            } else if (score > secondHighest && score < firstHighest) {
                secondHighest = score;
            }
        }
        return new int[]{firstHighest, secondHighest};
    }

    public static void main(String[] args) {
        int[] myArray = new int[]{84, 85, 86, 87, 85, 90, 85, 83, 23, 45, 84, 1, 2, 0};
        System.out.println(Arrays.toString(findTopTwoScores(myArray)));
    }
}
