package arrays.exercises.matrix_rotation;

import java.util.Arrays;

public class Solution1 {
    public static boolean rotateMatrix(int[][] matrix) {
        if (matrix.length == 0 || matrix.length != matrix[0].length)
            return false;
        int[][] temp = new int[matrix.length][matrix.length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                temp[j][matrix.length-1-i] = matrix[i][j];
            }
        }

        for(int i=0;i<temp.length;i++){
            for(int j=0;j<temp.length;j++){
                matrix[i][j] = temp[i][j];
            }
        }
        System.out.println(Arrays.deepToString(matrix));
        return true;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(rotateMatrix(matrix));
    }
}
