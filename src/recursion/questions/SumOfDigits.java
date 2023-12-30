package recursion.questions;

public class SumOfDigits {
    public static void main(String[] args) {
        int n = 1234500;
        var sum = sumOfDigits(n);
        System.out.println("Sum of digits for " + n + " = " + sum);
    }

    private static int sumOfDigits(int n) {
        if(n<=0){
            return 0;
        }
        return n % 10 + sumOfDigits(n / 10);
    }
}
