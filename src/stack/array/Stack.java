package stack.array;

public class Stack {
    private int[] arr;
    private int topOfStack;

    public Stack(int size){
        arr = new int[size];
        topOfStack = -1;
        System.out.println("The stack is created with stack of "+size);
    }

    public boolean isEmpty(){
        return topOfStack==-1;
    }

    public boolean isFull(){
        if(topOfStack == arr.length-1){
            System.out.println("The stack is full");
            return true;
        }else{
            return false;
        }
    }
}
