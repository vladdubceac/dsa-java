package arrays.exercises.find_number;

import java.util.Arrays;

public class Solution1 {
//    Write a program to to check if an array contains a number in Java.
//    int[] intArray = {1,2,3,4,5,6};
//    searchInArray(intArray, 6); // 5

    public static int searchInArray(int[] intArray, int valueToSearch) {
        // TODO
        for(int index=0;index<intArray.length;index++){
            if(intArray[index] == valueToSearch){
                return index;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] intArray = new int[]{1,2,3,4,5,6};
        int num = 6;
        System.out.println("Searching "+ num +" in "+ Arrays.toString(intArray)+ " , index = "+searchInArray(intArray,num));
    }
}
