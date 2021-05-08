package dataStructure.queue;

public class ArrayQueue {

    int max = 1000;
    int front;
    int rear;
    int[] queue;

    public ArrayQueue() {
        front = 0;
        rear = 0;
        queue = new int[max];
    }

    public boolean isEmpty() {
        return front == rear;
    }

    public boolean isFull() {
        return rear == max-1;
    }

    public int size() {
        return rear - front;
    }

    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue is Full.");
        } else {
            queue[rear++] = value;
        }
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;

        } else {
            return queue[front++];
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;

        } else {
            return queue[front];
        }
    }
}
