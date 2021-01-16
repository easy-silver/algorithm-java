package chap04;

import java.util.Scanner;

public class IntAryQueueTester {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 100, cmd, x;
        IntAryQueue queue = new IntAryQueue(max);

        while (true) {
            System.out.printf("현재 데이터 수: %d / %d\n", queue.size(), max);
            System.out.print("(1)인큐 (2)디큐 (3)조회 : ");
            cmd = sc.nextInt();

            if(cmd == 0) break;

            switch (cmd) {
                case 1:
                    System.out.print("데이터 입력: ");
                    x = sc.nextInt();
                    queue.enqueue(x);
                    break;
                case 2:
                    System.out.println(queue.dequeue());
                    break;
                case 3:
                    queue.show();
                    break;
            }

        }

    }
}
