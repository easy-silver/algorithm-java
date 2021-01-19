package bjalgo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Q1406 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        Stack<Character> left = new Stack<>();
        Stack<Character> right = new Stack<>();
        Stack<Character> reversed = new Stack<>();

        String defaultString = br.readLine();
        //하나씩 쪼개서 left 스택에 담아준다.
        for (int i = 0; i < defaultString.length(); i++) {
            left.push(defaultString.charAt(i));
        }

        int count = Integer.parseInt(br.readLine());
        char[] inputArr;
        char cmd, value;

        while (count-- > 0) {

            // 명령어 입력받기
            inputArr = br.readLine().toCharArray();
            // L/D/B/P switch
            cmd = inputArr[0];
            switch (cmd) {
                // 커서를 왼쪽으로 이동
                case 'L':
                    if(!left.isEmpty())
                        right.push(left.pop());
                    break;
                // 커서를 오른쪽으로 이동
                case 'D':
                    if(!right.isEmpty())
                        left.push(right.pop());
                    break;
                // 왼쪽 문자 하나 지우기
                case 'B':
                    if(!left.isEmpty())
                        left.pop();
                    break;
                // 왼쪽에 문자 삽입
                case 'P':
                    value = inputArr[2];
                    left.push(value);
                    break;
            }
        }

        while (!left.isEmpty()) {
            reversed.push(left.pop());
        }
        while (!reversed.isEmpty()) {
            sb.append(reversed.pop());
        }
        while (!right.isEmpty()) {
            sb.append(right.pop());
        }
        System.out.println(sb);
    }
}
