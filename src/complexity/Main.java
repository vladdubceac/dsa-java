package complexity;

public class Main {

    public static void main(String[] args) {
//        System.out.println(multiplyNumbers(100));
        printNumbers(100);
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
}
