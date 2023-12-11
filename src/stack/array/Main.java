package stack.array;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack(4);
        boolean result = stack.isEmpty();
        System.out.println("Is empty = "+result);
        result = stack.isFull();
        System.out.println("Is full = "+result);
    }
}
