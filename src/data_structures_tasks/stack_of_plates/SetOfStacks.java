package data_structures_tasks.stack_of_plates;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class SetOfStacks {

    public int capacity;
    ArrayList<Stack> stacks = new ArrayList<Stack>();

    public SetOfStacks(int capacity) {
        this.capacity = capacity;
    }

    public Stack getLastStack() {
        Stack last = null;
        if (stacks.size() == 0) {
            System.out.println("No stacks");
            return last;
        } else {
            for (int i = 0; i < stacks.size(); i++) {
                if (!stacks.get(i).isFull()) {
                    last = stacks.get(i);
                    break;
                }
            }
        }
        return last;
    }

    public boolean push(int value) {
        if (stacks.isEmpty()) {
            stacks.add(new Stack(capacity));
            return stacks.get(0).push(value);
        } else {
            int stackNumber = -1;
            for (int index = 0; index < stacks.size(); index++) {
                if (stacks.get(index).isFull()) {
                    continue;
                } else {
                    stackNumber = index;
                    break;
                }
            }
            if (stackNumber == -1) {
                Stack stack = new Stack(capacity);
                stacks.add(stack);
                return stack.push(value);
            } else {
                return stacks.get(stackNumber).push(value);
            }
        }
    }

    public int pop() {
        Stack last = getLastStack();
        if (last == null) {
            throw new EmptyStackException();
        }
        int result = last.pop();
        if (last.size == 0) {
            stacks.remove(last);
        }
        return result;
    }

    public int leftShift(int index, boolean removeTop) {
        Stack stack = stacks.get(index);
        int removedItem;
        if (removeTop) {
            removedItem = stack.pop();
        }else {
            removedItem = stack.removeBottom();
        }

        if(stack.size==0){
            stacks.remove(index);
        }else if(stacks.size()>index+1){
            int v = leftShift(index+1,false);
            stack.push(v);
        }
        return removedItem;
    }

    public int popAt(int index){
        return leftShift(index,true);
    }
}
