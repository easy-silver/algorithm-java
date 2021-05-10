package dataStructure.stack;

public class ArrayStack implements Stack {
    private int top;
    private int stackSize;
    private char[] stackArr;

    public ArrayStack(int stackSize) {
        top = -1;
        this.stackSize = stackSize;
        stackArr = new char[this.stackSize];
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }

    @Override
    public boolean isFull() {
        return top == (this.stackSize-1);
    }

    @Override
    public void push(char data) {
        if (isFull()) {
            System.out.println("Stack is full.");
        } else {
            stackArr[++top] = data;
        }
    }

    @Override
    public char pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return 0;

        } else {
            return stackArr[top--];
        }
    }

    @Override
    public char peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return 0;

        } else {
            return stackArr[top];
        }
    }

    @Override
    public void clear() {
        if (isEmpty()) {
            System.out.println("Stack is already empty.");
        } else {
            top = -1;
            stackArr = new char[stackSize];
        }
    }
}
