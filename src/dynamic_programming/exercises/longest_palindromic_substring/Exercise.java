package dynamic_programming.exercises.longest_palindromic_substring;

public class Exercise {
    static String longestPalindrome(String s) {
        int length = s.length();
        String res = s.substring(0, 1);
        for (int i = 0; i < length; i++) {
            String ps = getPalindrome(s, i, i);
            res = ps.length() > res.length() ? ps : res;
            ps = getPalindrome(s, i, i + 1);
            res = ps.length() > res.length() ? ps : res;
        }
        return res;
    }

    private static String getPalindrome(String string, int left, int right) {
        while (left >= 0 && right < string.length() && string.charAt(left) == string.charAt(right)) {
            left--;
            right++;
        }
        return string.substring(left + 1, right);
    }

    public static void main(String[] args) {
        String str = "BABAD";
        String longestPalindromeSubstring = longestPalindrome(str);
        System.out.printf("Longest palindrome substring for %s is %s\n", str, longestPalindromeSubstring);
    }
}
