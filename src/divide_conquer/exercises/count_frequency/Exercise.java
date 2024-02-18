package divide_conquer.exercises.count_frequency;

public class Exercise {

    public static int sortedFrequency(int[] arr, int num) {
        int left = 0;
        int right = arr.length - 1;
        int leftCount = 0;
        int rightCount = 0;
        while (left <= right) {
            int middle = (int) Math.floor((left + right) / 2);
            if (arr[middle] == num) {
                leftCount = middle;
                rightCount = middle;
                while (arr[leftCount]==num && leftCount >= 0) {
                    leftCount -= 1;
                }

                while (rightCount<arr.length && arr[rightCount]  == num) {
                    rightCount += 1;
                }
                return rightCount - leftCount - 1;
            }
            if (arr[middle] < num) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 2, 2, 3};
        int res = sortedFrequency(arr,2);
        System.out.println(res);

        arr = new int[]{1, 1, 2, 2, 2, 2, 3};
        res = sortedFrequency(arr, 3);
        System.out.println(res);

        res = sortedFrequency(new int[]{1, 1, 2, 2, 2, 2, 3}, 4);
        System.out.println(res);

        res =sortedFrequency(new int[]{}, 4);
        System.out.println(res);
    }
}
