package stack.tasks.queue_via_stacks;

import java.util.Stack;

public class QueueViaStack {
    public Stack<Integer> newStack, oldStack;

    public int size() {
        return newStack.size() + oldStack.size();
    }

    public QueueViaStack(){
        newStack = new Stack<Integer>();
        oldStack = new Stack<Integer>();
    }

    public void enqueue(int value){
        newStack.push(value);
    }

    public int dequeue(){
        populateOldStack();
        return oldStack.pop();
    }

    private void populateOldStack() {
        if (oldStack.isEmpty()) {
            while (!newStack.isEmpty()) {
                oldStack.push(newStack.pop());
            }
        }
    }

    public int peek(){
        populateOldStack();
        return oldStack.peek();
    }
}
