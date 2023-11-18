package arrays.exercises.remove_duplicates;

public class Solution2 {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int i = 0;

        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }

        return i + 1;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 1, 2};
        System.out.println(removeDuplicates(arr));
    }
}
