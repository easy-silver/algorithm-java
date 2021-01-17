package bjalgo;

import java.io.*;
import java.util.Stack;

public class Q9093 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int repeat = Integer.parseInt(bf.readLine());
        Stack<Character> stack = new Stack<>();
        String inputString;

        for (int i = 0; i < repeat; i++) {
            inputString = bf.readLine() + " ";
            for (int j = 0; j < inputString.length(); j++) {
                // 공백을 만나면 출력
                if(inputString.charAt(j) == ' ') {
                    while (!stack.empty()) {
                        bw.write(stack.pop());
                    }
                    bw.write(" ");
                // 공백아닐 경우는 스택에 담기
                }else{
                    stack.push(inputString.charAt(j));
                }
            }
            bw.write("\n");
        }
        bw.flush();
        return;
    }
}
