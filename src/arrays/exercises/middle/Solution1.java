package arrays.exercises.middle;

import java.util.Arrays;

public class Solution1 {
//    Write a function called middle that takes an array and returns a new array that contains all but the first and last elements.
//    myArray = [1, 2, 3, 4]
//    middle(myArray)  # [2,3]

    public static int[] middle(int[] array){
        int[] newArray = new int[array.length - 2];
        for(int i=1,count=0;i<array.length-1;i++){
            newArray[count++]=array[i];
        }
        return newArray;
    }

    public static void main(String[] args) {
        int[] myArray=new int[]{1,2,3,4};
        System.out.println(Arrays.toString(myArray));
        System.out.println(Arrays.toString(middle(myArray)));
    }

}
