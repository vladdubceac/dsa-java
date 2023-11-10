package complexity;

public class Main {

    public static void main(String[] args) {
//        System.out.println(multiplyNumbers(100));
//        printNumbers(100);
//        printNumbers2(10);
        dropNonDominantTerm(100);
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
}
