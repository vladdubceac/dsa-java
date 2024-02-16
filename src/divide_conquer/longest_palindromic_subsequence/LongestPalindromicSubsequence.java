package divide_conquer.longest_palindromic_subsequence;

public class LongestPalindromicSubsequence {
    private int findLongestPalindromicSubsequenceLength(String string, int startIndex, int endIndex) {
        if (startIndex > endIndex) {
            return 0;
        }
        if (startIndex == endIndex) {
            return 1;
        }

        int count1 = 0;
        if (string.charAt(startIndex) == string.charAt(endIndex)) {
            count1 = 2 + findLongestPalindromicSubsequenceLength(string, startIndex + 1, endIndex - 1);
        }
        int count2 = findLongestPalindromicSubsequenceLength(string, startIndex + 1, endIndex);
        int count3 = findLongestPalindromicSubsequenceLength(string, startIndex, endIndex - 1);
        return Math.max(count1, Math.max(count2,count3));
    }

    public int findLPSLength(String string){
        return findLongestPalindromicSubsequenceLength(string,0,string.length()-1);
    }
}
