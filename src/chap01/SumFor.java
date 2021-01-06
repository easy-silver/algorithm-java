package chap01;

import java.util.Scanner;

/*
* 1, 2, ..., n의 합을 구합니다.
*/
public class SumFor {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("1부터 n까지의 합을 구합니다.");
        System.out.print("n의 값: ");
        int n = stdIn.nextInt();

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
            sum += i;
            if (i != n) {
                System.out.print("+ ");
            }
        }
        System.out.println("= " + sum);
        System.out.printf("1부터 %d까지의 합은 %d입니다.", n, sum);
    }
}
