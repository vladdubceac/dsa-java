package stack.array;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack(4);
        boolean result = stack.isEmpty();
        System.out.println("Is empty = "+result);
        result = stack.isFull();
        System.out.println("Is full = "+result);

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        int top = stack.pop();
        System.out.println("pop - "+top);
        System.out.println("peek - "+stack.peek());
        System.out.println("peek - "+stack.peek());
        System.out.println("pop - "+stack.pop());
        System.out.println("peek - "+stack.peek());
        System.out.println("pop - "+stack.pop());
        stack.deleteStack();
    }
}
