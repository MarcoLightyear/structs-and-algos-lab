package structures;

public class Queue {
    private int maxSize;
    private int[] queueArray;
    private int front;
    private int rear;
    private int numberOfItems;

    public Queue(int maxSize) {
        this.maxSize = maxSize;
        this.queueArray = new int[maxSize];
        this.front = 0;
        this.rear = -1;
        this.numberOfItems = 0;
    }

    public void enqueue(int value)
    {
        if (rear == maxSize - 1)
            rear = -1;
        queueArray[++rear] = value;
        numberOfItems++;
    }

    public int dequeue(){
        int temp = queueArray[front++];
        if(front == maxSize)
            front = 0;
        numberOfItems--;
        return temp;
    }

    public boolean isEmpty(){
        return numberOfItems == 0;
    }

    public boolean isFull(){
        return numberOfItems == maxSize;
    }

    public int size(){
        return numberOfItems;
    }

}
