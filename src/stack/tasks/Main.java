package stack.tasks;

public class Main {
    public static void main(String[] args) {
        ThreeInOne newStacks = new ThreeInOne(3);
        boolean isFull = newStacks.isEmpty(0);
        System.out.println(isFull);
        boolean isEmpty = newStacks.isEmpty(0);
        newStacks.push(0,12);
        System.out.println(newStacks.isFull(0));
        System.out.println(newStacks.isEmpty(0));
        newStacks.push(0,8);
        newStacks.push(0,3);
        System.out.println(newStacks.isFull(0));
        System.out.println(newStacks.peek(0));
        System.out.println(newStacks.pop(0));
        System.out.println(newStacks.peek(0));


    }
}
