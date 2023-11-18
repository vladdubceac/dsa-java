package arrays.exercises.two_sum;

import java.util.Arrays;

public class Solution1 {
    //    Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target. You may assume that each input would have exactly one solution, and you may not use the same element twice.
//            Examples
//    Input: nums = [2,7,11,15], target = 9
//    Output: [0,1]
//    Output: Because nums[0] + nums[1] == 9, we return [0, 1]
//    Input: nums = [3,2,4], target = 6
//    Output: [1,2]
    public static int[] twoSum(int[] nums, int target) {
        // TODO
        int index1 = -1;
        int index2 = -1;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    index1 = i;
                    index2 = j;
                    break;
                }
            }
            if (index1 >= 0 && index2 >= 0) {
                break;
            }
        }
        return new int[]{index1, index2};
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{12, 7, 11,2, 15};
        int target1 = 9;

        int[] nums2 = new int[]{31, 2, 45, 4};
        int target2 = 6;

        System.out.println(Arrays.toString(nums1) + ", target = " + target1 + ", solution = " + Arrays.toString(twoSum(nums1, target1)));
        System.out.println(Arrays.toString(nums2) + ", target = " + target2 + ", solution = " + Arrays.toString(twoSum(nums2, target2)));
    }
}
