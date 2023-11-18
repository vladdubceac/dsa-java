package arrays.exercises.two_sum;

import java.util.Arrays;

public class Solution2 {
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution found");
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
