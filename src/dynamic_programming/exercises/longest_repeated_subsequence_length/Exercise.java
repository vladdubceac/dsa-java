package dynamic_programming.exercises.longest_repeated_subsequence_length;

public class Exercise {
    static int findLongestRepeatingSubSeq(String str) {
        int n = str.length();
        int[][] dp = new int[n + 1][n + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (str.charAt(i - 1) == str.charAt(j - 1) && i != j) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j]);
                }
            }
        }
        return dp[n][n];
    }


    public static int findLCSLengthTD(String s1, String s2) {
        int[][] dp = new int[s1.length()][s2.length()]; // dp table will store all the results
        for (int i = 0; i < s1.length(); i++) {
            for (int j = 0; j < s2.length(); j++) {
                dp[i][j] = -1;
            }
        }
        return findLCSLengthAux(dp, s1, s2, 0, 0);
    }

    private static int findLCSLengthAux(int[][] dp, String s1, String s2, int i1, int i2) {
        if (i1 == s1.length() || i2 == s2.length()) {
            return 0;
        }
        if (dp[i1][i2] == -1) {
            if (s1.charAt(i1) == s2.charAt(i2)) {
                dp[i1][i2] = 1 + findLCSLengthAux(dp, s1, s2, i1 + 1, i2 + 1);
                return dp[i1][i2];
            } else {
                int c1 = findLCSLengthAux(dp, s1, s2, i1, i2 + 1);
                int c2 = findLCSLengthAux(dp, s1, s2, i1 + 1, i2);
                dp[i1][i2] = Math.max(c1, c2);
            }
        }
        return dp[i1][i2];
    }

    public static int findLCSLengthBU(String s1, String s2) {
        int[][] dp = new int[s1.length() + 1][s2.length() + 1];
        for (int i = s1.length(); i >= 1; i--) {
            for (int j = s2.length(); j >= 1; j--) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i - 1][j - 1] = Math.max(1 + dp[i][j], Math.max(dp[i][j - 1], dp[i - 1][j]));
                }else{
                    dp[i-1][j-1]=Math.max(dp[i][j-1],dp[i-1][j]);
                }
            }
        }
        return dp[0][0];
    }

    public static void main(String[] args) {
        String str = "ATAKTKGGA";
        int longestRepeatingSubsequenceLength = findLongestRepeatingSubSeq(str);
//        System.out.println(longestRepeatingSubsequenceLength);

        String S1 = "ABCBDAB";
        String S2 = "BDCABA";
//        int length = findLCSLengthTD(S1, S2);
        int length = findLCSLengthBU(S1, S2);
        System.out.println(length);
    }
}
