package recursion.questions;

public class PalindromeString {
    public static void main(String[] args) {
        boolean b = isPalindrome("awesome"); // # false
        System.out.println(b);
        b = isPalindrome("foobar"); // # false
        System.out.println(b);
        b = isPalindrome("tacocat"); // # true
        System.out.println(b);
        b = isPalindrome("amanaplanacanalpanama"); // # true
        System.out.println(b);
        b = isPalindrome("amanaplanacanalpandemonium");
        System.out.println(b);
        b = isPalindrome("abcba");
        System.out.println(b);

    }

    public static boolean isPalindrome(String s) {
        if (s == null || s.trim().isEmpty() || s.trim().length() == 1) {
            return true;
        }

        return s.charAt(0) == s.charAt(s.length() - 1) &&
                isPalindrome(s.substring(1, s.length() - 1));
    }
}
