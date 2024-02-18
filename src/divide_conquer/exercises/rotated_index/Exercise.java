package divide_conquer.exercises.rotated_index;

public class Exercise {

    public static int findRotatedIndex(int[] arr, int num) {
        int left = 0;
        int right = arr.length - 1;
        int middle = 0;
        if (right>0 && arr[left] >= arr[right]) {
            middle = (int) Math.floor((left + right) / 2);
            while (arr[middle] <= arr[middle + 1]) {
                if (arr[left] <= arr[middle]) {
                    left = middle + 1;
                } else {
                    right = middle - 1;
                }
                middle = (int) Math.floor((left + right) / 2);
                if (middle+1 > arr.length-1) {
                    break;
                }

            }
            if (num >= arr[0] && num <= arr[middle]) {
                left = 0;
                right = middle;
            } else {
                left = middle + 1;
                right = arr.length - 1;
            }

        }
        while (left <= right) {
            middle = (int) Math.floor((left + right) / 2);
            if (num == arr[middle]) {
                return middle;
            }
            if (num > arr[middle]) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int result;
        result = findRotatedIndex(new int[]{3, 4, 1, 2}, 4);
        System.out.println(result);
        result=findRotatedIndex(new int[]{4, 6, 7, 8, 9, 1, 2, 3, 4}, 8);
        System.out.println(result);
        result=findRotatedIndex(new int[]{6, 7, 8, 9, 1, 2, 3, 4}, 3);
        System.out.println(result);
        result=findRotatedIndex(new int[]{37, 44, 66, 102, 10, 22}, 14);
        System.out.println(result);
        result=findRotatedIndex(new int[]{6, 7, 8, 9, 1, 2, 3, 4}, 12);
        System.out.println(result);
        result=findRotatedIndex(new int[]{11, 12, 13, 14, 15, 16, 3, 5, 7, 9}, 16);
        System.out.println(result);
        result=findRotatedIndex(new int[]{11, 12, 13, 17, 39}, 17);
        System.out.println(result);
        result=findRotatedIndex(new int[]{11}, 11);
        System.out.println(result);
        result=findRotatedIndex(new int[]{}, 11);
        System.out.println(result);
        result=findRotatedIndex(new int[]{4, 4, 4, 4, 4}, 5);
        System.out.println(result);
    }
}

