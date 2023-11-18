package arrays.exercises.missing_number;

public class Solution1 {
//    Write Java function called findMissingNumberInArray that takes an integer array containing n-1 unique elements from a range of 1 to n, with one missing number, and returns the missing number.
//    myArray = {1,2,3,4,6}
//    findMissingNumberInArray(myArray, 6) // 5
//    Hint: Use the formula (n * (n + 1)) / 2 which  calculates the sum of the first n natural numbers.

    static int findMissingNumberInArray(int[] arr) {
        int arrSum = 0;
        for (int i = 0; i < arr.length; i++) {
            arrSum += arr[i];
        }

        int n = arr.length + 1;
        int nSum = (n * (n + 1)) / 2;
        return nSum - arrSum;
    }

    public static void main(String[] args) {
        int[] myArray = new int[]{1, 2, 3, 4, 6};
        System.out.println(findMissingNumberInArray(myArray));
    }
}
