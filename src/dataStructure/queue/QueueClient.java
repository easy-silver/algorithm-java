package dataStructure.queue;

public class QueueClient {
    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue();
        System.out.println(queue.peek());
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        System.out.println(queue.peek());
        queue.dequeue();
        System.out.println(queue.peek());
    }
}
