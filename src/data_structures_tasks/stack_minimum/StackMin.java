package data_structures_tasks.stack_minimum;

public class StackMin {
    Node top;
    Node min;

    public StackMin(){
        top = null;
        min = null;
    }

    public int min(){
        return min.getValue();
    }

    public void push(int value){
        if(min == null){
            min = new Node(value, min);
        }else if (min.getValue() < value) {
            min = new Node(min.getValue(), min);
        } else {
            min = new Node(value, min);
        }
        top = new Node(value, top);
    }

    public int pop(){
        int pop = top.getValue();
        top = top.getNext();
        if(pop == min.getValue()){
            min = min.getNext();
        }
        return pop;
    }
}
