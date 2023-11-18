package arrays.exercises.diagonal_sum;

public class Solution1 {
//    Given 2D array calculate the sum of diagonal elements.
//    myArray2D= {{1,2,3},{4,5,6},{7,8,9}};
//    sumDiagonalElements(myArray2D) # 15
    public static int sumDiagonalElements(int[][] array){
        int sizeOfArray = array.length;
        int sum = 0;
        for(int i = 0; i <sizeOfArray;i++){
            sum += array[i][i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] myArray2D = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(sumDiagonalElements(myArray2D));
    }
}
