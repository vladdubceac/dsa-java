package divide_conquer.longest_common_subsequence;

public class Main {
    public static void main(String[] args) {
        LongestCommonSubsequence longestCommonSubsequence = new LongestCommonSubsequence();
        String s1="elephant";
        String s2="erepat";
        int result = longestCommonSubsequence.findLongestCommonSubsequenceLength(s1,s2);
        System.out.println(result);
    }
}
