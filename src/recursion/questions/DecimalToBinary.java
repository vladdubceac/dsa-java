package recursion.questions;

public class DecimalToBinary {
    public static void main(String[] args) {
        int n = 131;
        int binary = decimalToBinary(n);
        System.out.println("Decimal representation for " + n + " is " + binary);
    }

    private static int decimalToBinary(int n) {
        if (n == 0) {
            return 0;
        }
        return n % 2+ 10 * decimalToBinary(n / 2);
    }
}
