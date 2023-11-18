package arrays.exercises.remove_duplicates;

import java.util.Arrays;

public class Solution1 {
    //    Given a sorted array nums, remove the duplicates in-place such that each element appears only once and returns the new length. Do not allocate extra space for another array; you must do this by modifying the input array in-place with O(1) extra memory.
//    Example:
//    Input: nums = [1, 1, 2]
//    Output: 2
    public static int removeDuplicates(int[] nums) {
        //TODO
        if (nums.length == 0) {
            return 0;
        }

        int index = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                if (nums[i - 1] != Integer.MIN_VALUE) {
                    index = i;
                } else {
                    if (nums[i] != nums[index]) {
                        nums[index + 1] = nums[i];
                        nums[i] = Integer.MIN_VALUE;
                        index++;
                    } else {
                        nums[i] = Integer.MIN_VALUE;
                    }
                }
            } else {
                nums[i] = Integer.MIN_VALUE;
            }
        }
        return nums[index];
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 1, 2};
        System.out.println(removeDuplicates(arr));
    }
}
