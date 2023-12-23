package stack.tasks;

public class ThreeInOne {
  private int numberOfStacks = 3;
  private int stackCapacity;
  private int[] values;
  private int[] sizes;

  public ThreeInOne(int stackSize) {
    stackCapacity = stackSize;
    values = new int[numberOfStacks * stackCapacity];
    sizes = new int[numberOfStacks];
  }

  // isFull
  public boolean isFull(int stackNum) {
    return sizes[stackNum] == stackCapacity;
  }

  // isEmpty
  public boolean isEmpty(int stackNum) {
      return sizes[stackNum]==0;
  }

  // indexOfTop - this is helper method for push, pop and peek methods

  private int indexOfTop(int stackNum) {
     int offset = stackNum * stackCapacity;
     int size = sizes[stackNum];
     return offset + size - 1;
  }

  // push
  public void push(int stackNum, int value) {
    if(isFull(stackNum)){
        System.out.println("The stack is full");
        return;
    }
    sizes[stackNum]++;
    values[indexOfTop(stackNum)] = value;
  }

  // pop
  public int pop(int stackNum) {
    if(isEmpty(stackNum)){
        System.out.println("The stack is isEmpty");
        return -1;
    }
    int index = indexOfTop(stackNum);
    int currentTop = values[index];
    values[index] = 0;
    sizes[stackNum]--;
    return currentTop;
  }

  // peek
  public int peek(int stackNum) {
    if(isEmpty(stackNum)){
      System.out.println("The Stack is Empty");
      return -1;
    }
    return values[indexOfTop(stackNum)];
  }
}
