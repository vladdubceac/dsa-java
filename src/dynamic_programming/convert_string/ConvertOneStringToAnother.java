package dynamic_programming.convert_string;

import java.util.HashMap;
import java.util.Map;

public class ConvertOneStringToAnother {
    public int findMinOperationsTD(String s1, String s2) {
        // TODO
        return findMinOperationsTD(s1, s2, 0, 0, new HashMap<>());
    }

    private int findMinOperationsTD(String s1, String s2, int index1, int index2, Map<int[], Integer> map) {
        if (index1 == s1.length()) {
            return s2.length() - index2;
        }
        if (index2 == s2.length()) {
            return s1.length() - index1;
        }
        if (s1.charAt(index1) == s2.charAt(index2)) {
            return findMinOperationsTD(s1, s2, index1 + 1, index2 + 1, map);
        } else {
            int[] keyArr = {index1, index2};
            if (!map.containsKey(keyArr)) {
                int deleteOp = 1 + findMinOperationsTD(s1, s2, index1, index2 + 1, map);
                int insertOp = 1 + findMinOperationsTD(s1, s2, index1 + 1, index2, map);
                int replaceOp = 1 + findMinOperationsTD(s1, s2, index1 + 1, index2 + 1, map);
                map.put(keyArr, Math.min(deleteOp, Math.min(insertOp, replaceOp)));
            }
            return map.get(keyArr);
        }
    }

    public int findMinOperationsTD_2(String s1, String s2) {
        Integer[][] dp = new Integer[s1.length() + 1][s2.length() + 1];
        return findMinOperationsTD_2(dp, s1, s2, 0, 0);
    }//end of method

    private int findMinOperationsTD_2(Integer[][] dp, String s1, String s2, int i1, int i2) {
        if (dp[i1][i2] == null) {
            if (i1 == s1.length()) // if we have reached the end of s1, then insert all the remaining characters of s2
                dp[i1][i2] = s2.length() - i2;

            else if (i2 == s2.length()) // if we have reached the end of s2, then delete all the remaining characters of s1
                dp[i1][i2] = s1.length() - i1;

            else if (s1.charAt(i1) == s2.charAt(i2)) // If the strings have a matching character, recursively match for the remaining lengths.
                dp[i1][i2] = findMinOperationsTD_2(dp, s1, s2, i1 + 1, i2 + 1);

            else {
                int c1 = findMinOperationsTD_2(dp, s1, s2, i1 + 1, i2); //delete
                int c2 = findMinOperationsTD_2(dp, s1, s2, i1, i2 + 1); //insert
                int c3 = findMinOperationsTD_2(dp, s1, s2, i1 + 1, i2 + 1); //replace
                dp[i1][i2] = 1 + Math.min(c1, Math.min(c2, c3));
            }
        }//end of if-else
        return dp[i1][i2];
    }//end of method
}
