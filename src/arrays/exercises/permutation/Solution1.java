package arrays.exercises.permutation;

public class Solution1 {
    //    Your are given two integer arrays. Write a program to check if they are permutation of each other.
//    Example
//    int[] array1 = {1,2,3,4,5};
//    int[] array2 = {5,1,2,3,4};
//    permutation(array1, array2)
//    Output : true
    public static boolean permutation(int[] array1, int[] array2) {
        // TODO
        int identicElements = 0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    identicElements++;
                }
            }
        }
        return identicElements == array1.length;
    }

    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5};
        int[] array2 = {5,1,2,3,4};
        System.out.println(permutation(array1,array2));
    }
}
