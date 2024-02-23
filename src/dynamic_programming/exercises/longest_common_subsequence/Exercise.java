package dynamic_programming.exercises.longest_common_subsequence;

public class Exercise {

    static char[] lcs(String X, String Y, int m, int n) {
        int[][] arr = new int[m + 1][n + 1];
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0) {
                    arr[i][j] = 0;
                } else if (X.charAt(i - 1) == Y.charAt(j - 1)) {
                    arr[i][j] = arr[i - 1][j - 1] + 1;
                } else {
                    arr[i][j] = Math.max(arr[i - 1][j], arr[i][j - 1]);
                }
            }
        }

        int index = arr[m][n];
        int temp = index;

        char[] lcs = new char[index + 1];
        lcs[index] = '\u0000';

        int i = m;
        int j = n;
        while (i > 0 && j > 0) {
            if (X.charAt(i - 1) == Y.charAt(j - 1)) {
                lcs[index - 1] = X.charAt(i - 1);

                i--;
                j--;
                index--;
            } else if (arr[i - 1][j] > arr[i][j - 1]) {
                i--;
            } else {
                j--;
            }
        }
        return lcs;
    }

    static char[] lcs(String s1, String s2) {
        return lcs(s1, s2, s1.length(), s2.length());
    }

    public static void main(String[] args) {
        String s1 = "ABCBDAB";
        String s2 = "BDCABA";
        System.out.println(lcs(s1, s2));
    }
}
