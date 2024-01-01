package recursion.questions;

public class CapitalizeWord {
    public static void main(String[] args) {
        String str = "i learn java";
        String strInitCap = capitalizeWord(str);
        System.out.println(strInitCap);

        strInitCap = capitalize(str);
        System.out.println(strInitCap);
    }


    public static String capitalizeWord(String str) {
        if (str.isEmpty()) {
            return str;
        }
        char chr = str.charAt(str.length() - 1);
        if (str.length() == 1) {
            return Character.toString(Character.toUpperCase(chr));
        }
        if ((str.substring(str.length() - 2, str.length() - 1).equals(" "))) {
            chr = Character.toUpperCase(chr);
        }
        return capitalizeWord(str.substring(0, str.length() - 1)) + Character.toString(chr);
    }

    public static String capitalize(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        if (str.length() == 1) {
            return String.valueOf(Character.toUpperCase(str.charAt(0)));
        }
        if (!str.contains(" ")) {
            return Character.toUpperCase(str.charAt(0)) + str.substring(1);
        }
        if (str.indexOf(' ') == str.length() - 1) {
            return Character.toUpperCase(str.charAt(0)) + str.substring(1);
        }

        return capitalize(str.substring(0, str.indexOf(' ') + 1)) + capitalize(str.substring(str.indexOf(' ') + 1));
    }
}
