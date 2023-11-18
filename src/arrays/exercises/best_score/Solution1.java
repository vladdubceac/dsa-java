package arrays.exercises.best_score;

import java.util.Arrays;

public class Solution1 {
//    Given an array, write a function to get first, second best scores from the array and return it in new array.
//    Array may contain duplicates.
//    myArray = {84,85,86,87,85,90,85,83,23,45,84,1,2,0}
//    firstSecond(myArray) // {90, 87}
    public static int[] findTopTwoScores(int[] array){
        int[] bestScores = new int[2];
        bestScores[0] = array[0];
        bestScores[1] = array[1];
        for(int i=2;i<array.length;i++){
            int minElementIndex = bestScores[0]<bestScores[1] ? 0 : 1;
            if(array[i] > bestScores[minElementIndex]){
                bestScores[minElementIndex] = array[i];
            }
        }
        return bestScores;
    }

    public static void main(String[] args){
        int[] myArray = new int[]{84,85,86,87,85,90,85,83,23,45,84,1,2,0};
        System.out.println(Arrays.toString(findTopTwoScores(myArray)));
    }
}
