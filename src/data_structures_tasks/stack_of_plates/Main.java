package data_structures_tasks.stack_of_plates;

public class Main {
    public static void main(String[] args) {
        Stack newStack = new Stack(3);
        System.out.println(newStack.isFull());
        newStack.push(1);
        newStack.push(2);
        System.out.println(newStack.pop());

        SetOfStacks newSetOfStacks = new SetOfStacks(3);
        newSetOfStacks.push(1);
        newSetOfStacks.push(2);
        newSetOfStacks.push(3);
        newSetOfStacks.push(4);
        newSetOfStacks.push(5);
        System.out.println(newSetOfStacks.popAt(0));
        System.out.println(newSetOfStacks.popAt(0));

    }
}
