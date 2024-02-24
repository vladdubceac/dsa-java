package dynamic_programming.exercises.longest_palindromic_subsequence;

public class Exercise {
    public static int findLPSLength(String string) {
        Integer[][] matrix = new Integer[string.length()][string.length()];
        return findLPSLengthAux(matrix, string, 0, string.length() - 1);
    }

    private static int findLPSLengthAux(Integer[][] matrix, String str, int startIndex, int endIndex) {
        if (startIndex > endIndex) { //BASE CASE - If we have traversed more than 1/2 of string then return 0 as we dont need to process it
            return 0;
        }
        if (startIndex == endIndex) { //BASE CASE - If both the index are at same position then its a palindrome as its 1 character.
            return 1;
        }
        int temp = 0;
        if (matrix[startIndex][endIndex] == null) { //If we have not solved this problem previously, only then solve it
            if (str.charAt(startIndex) == str.charAt(endIndex)) {
                temp = 2 + findLPSLengthAux(matrix, str, startIndex + 1, endIndex - 1); //CASE#1 - If index pointed characters matches then we add 2 to the existing known palindrome length
            }
            int temp1 = findLPSLengthAux(matrix, str, startIndex + 1, endIndex); //CASE#2 - Skip one element from beginning
            int temp2 = findLPSLengthAux(matrix, str, startIndex, endIndex - 1); //CASE#3 - Skip one element from end
            matrix[startIndex][endIndex] = Math.max(temp, Math.max(temp1, temp2));
        }
        return matrix[startIndex][endIndex];
    }

    public static int findLPSLengthBU(String str) {
        int[][] arr = new int[str.length()][str.length()];
        for (int col = 0; col < str.length(); col++) {
            for (int row = str.length() - 1; row >= 0; row--) {
                if (row > col) { // BASE CASE - If we have traversed more than 1/2 of string then return 0 as we dont need to process it
                    arr[row][col] = 0;
                } else if (row == col) { // BASE CASE - If both the index are at same position then its a palindrome as its 1 character.
                    arr[row][col] = 1;
                } else {
                    if (str.charAt(row) == str.charAt(col)) {
                        arr[row][col] = Math.max(2 + arr[row + 1][col - 1], Math.max(arr[row][col - 1], arr[row + 1][col]));
                    } else {
                        arr[row][col] = Math.max(arr[row][col - 1], arr[row + 1][col]);
                    }
                }
            }
        }// end of loop
        return arr[0][str.length() - 1];
    }

    public static void main(String[] args) {
        String string = "ELRMENMET";
        int length = findLPSLength(string);
        System.out.printf("Longest palindromic sequence length for %s is %d\n", string, length);
        length = findLPSLengthBU(string);
        System.out.printf("Longest palindromic sequence length for %s with bottow-up approach is %d", string, length);
    }
}
