package arrays.exercises.duplicate_number;

import java.util.Arrays;

public class Solution1 {
    //    Write a function which takes integer array as a parameter and returns a new integer array with unique elements. (remove duplicates)
//    removeDuplicates({1, 1, 2, 2, 3, 4, 5})
//    Output : [1, 2, 3, 4, 5]
    public static int[] removeDuplicates(int[] arr) {
        int count = arr.length > 0 ? 1 : 0;
        if(arr.length==0){
            return new int[]{};
        }
        int[] newArray = new int[arr.length];
        newArray[0] = arr[0];
        for(int i=1, j=0; i < arr.length; i++){
            if(arr[i]!=newArray[j]){
                j++;
                count++;
                newArray[j] = arr[i];
            }
        }
        int result[] = new int[count];
        for(int i=0;i<count;i++){
            result[i] = newArray[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{1,1,2,2,3,4,5};
        System.out.println(Arrays.toString(removeDuplicates(arr)));
    }
}
