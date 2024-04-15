package structures;

public class Stack {
    private int maxSize;
    private int[] stackArray;
    private int top;

    public Stack(int maxSize){
        this.maxSize = maxSize;
        this.stackArray = new int[maxSize];
        this.top = -1;
    }

    public int pop(){
        return stackArray[top--];
    }

    public void push(int value){
        stackArray[++top] = value;
    }

    public int peek(){
        return stackArray[top];
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public boolean isFull(){
        return top == maxSize - 1;
    }
}
