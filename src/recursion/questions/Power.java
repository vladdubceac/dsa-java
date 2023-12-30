package recursion.questions;

public class Power {
    public static void main(String[] args) {
        int base = 3;
        int exp = 5;
        float result = power(base, exp);
        System.out.println(base + " to power " + exp + " = " + result);
    }

    private static float power(int base, int exp) {
        if (exp == 0) {
            if (base == 0) {
                throw new ArithmeticException("0 to 0 power !");
            } else {
                return 1;
            }
        }
        if (exp == 1) {
            return base;
        }

        double res = base * power(base,(exp>0 ? exp : -exp) -1);
        return (float) (exp>0 ? res : 1/res);
    }
}
