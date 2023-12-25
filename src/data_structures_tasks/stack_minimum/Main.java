package data_structures_tasks.stack_minimum;

public class Main {
    public static void main(String[] args) {
        StackMin stackMin = new StackMin();
        stackMin.push(10);
        stackMin.push(11);
        System.out.println("Min - "+stackMin.min());
        System.out.println("Top - "+stackMin.top.getValue());
        stackMin.push(8);
        System.out.println("Min - "+stackMin.min());
        System.out.println("Pop - " + stackMin.pop());
    }
}
