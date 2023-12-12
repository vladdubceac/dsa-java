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
//            System.out.println("The stack is full");
            return true;
        }else{
            return false;
        }
    }

    // Push
    public void push(int value){
        if(isFull()){
            System.out.println("The Stack is full");
        }else{
            arr[topOfStack+1]=value;
            topOfStack++;
            System.out.println("The value "+value+" is successfully inserted");
        }
    }

    // Pop
    public int pop(){
        if(isEmpty()){
            System.out.println("The stack is empty");
            return Integer.MIN_VALUE;
        }else {
            int top= arr[topOfStack];
            topOfStack--;
            return top;
        }
    }

    // Peek
    public int peek(){
        if(isEmpty()){
            System.out.println("The stack is empty !");
            return Integer.MIN_VALUE;
        }else{
            return arr[topOfStack];
        }
    }

    // delete
    public void deleteStack(){
        arr = null;
        System.out.println("The stack is successfully deleted !");
    }
}
