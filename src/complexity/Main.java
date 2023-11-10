package complexity;

public class Main {

    public static void main(String[] args) {
//        System.out.println(multiplyNumbers(100));
//        printNumbers(100);
//        printNumbers2(10);
//        dropNonDominantTerm(100);
        System.out.println(sumNumbersRecursively(10));
    }

    // O(1)
    private static int multiplyNumbers(int n) {
        return n * n;
    }

    // O(n)
    private static void printNumbers(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }
    }

    // O(n^2)
    private static void printNumbers2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(i + " " + j);
            }
        }
    }

    // O(n^2) drop non-dominant term
    private static void dropNonDominantTerm(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(i + " " + j);
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }
    }

    // O(a+b)
    private static void printNumbers(int a, int b) {
        for (int i = 0; i < a; i++) {
            System.out.println(i);
        }

        for (int j = 0; j < b; j++) {
            System.out.println(j);
        }
    }

    // O(a*b)
    private static void printNumbers2(int a, int b) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.println(i + " " + j);
            }
        }
    }

    // O(n)
    private static int sumNumbersRecursively(int n) {
        System.out.println("\t" + n);
        if (n <= 0) {
            return 0;
        }
        return n + sumNumbersRecursively(n - 1);
    }

    // Space complexity O(1)
    public static int pairSumSequence(int n) {
        var total = 0;
        for (int i = 0; i <= n; i++) {
            total = total + pairSum(i, i + 1);
        }
        return total;
    }

    public static int pairSum(int a, int b) {
        return a + b;
    }
}
