package dataStructure.stack;

interface Stack {

    boolean isEmpty();
    boolean isFull();
    void push(char data);
    char pop();
    char peek();
    void clear();

}
