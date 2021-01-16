package chap04;

public class IntAryQueue {
    private int max; //큐 용량
    private int[] que; //큐 본체

    private int front;
    private int rear;

    public IntAryQueue(int max) {
        this.max = max;
        que = new int[max];
        front = 0;
        rear = 0;
    }

    //인큐 : 데이터를 넣는 작업
    public void enqueue(int x) {
        if(rear >= max)
            System.out.println("용량을 초과하였습니다.");
        else
            que[rear++] = x;
    }

    //디큐 : 데이터를 꺼내는 작업
    public int dequeue() {
        if (front == rear) {
            System.out.println("큐가 비어있습니다.");
            return -1;
        } else {
            return que[front++];
        }
    }

    //사이즈 확인
    public int size() {
        return rear - front;
    }

    //순서대로 출력
    public void show() {
        if(front == rear) System.out.println("큐가 비어있습니다.");
        else{
            for (int i = front; i < rear; i++) {
                System.out.print(que[i] + " ");
            }
            System.out.println();
        }
    }
}
