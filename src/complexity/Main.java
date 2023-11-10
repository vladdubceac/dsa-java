package complexity;

public class Main {

    public static void main(String[] args) {
        System.out.println(multiplyNumbers(100));
    }

    // O(1) complexity example
    private static int multiplyNumbers(int n) {
        return n*n;
    }
}
