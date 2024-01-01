package recursion.questions;

public class StringReverse {
    public static void main(String[] args) {
        String s = "java";
        String sReversed = reverse(s);
        System.out.println(s + " reversed is " + sReversed);
    }

    private static String reverse(String s) {
        if (s == null || s.trim().isEmpty() || s.trim().length() == 1) {
            return s;
        }
        int index = s.length() - 1;
        return s.charAt(index) + reverse(s.substring(0, index));
    }
}
