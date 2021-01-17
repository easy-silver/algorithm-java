package bjalgo;

import java.io.*;
import java.util.Stack;

public class Q9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int repeat = Integer.parseInt(br.readLine());
        Stack<Character> stack = new Stack<>();
        boolean isVPS;

        while (repeat-- > 0) {
            String inputString = br.readLine();
            isVPS = true;
            stack.clear();
            for (char ch : inputString.toCharArray()) {
                if(ch == '(')
                    stack.push(ch);
                else
                if(stack.isEmpty()){
                    isVPS = false;
                    break;
                }
                else
                    stack.pop();
            }
            if (!stack.isEmpty())
                isVPS = false;

            if(isVPS)
                bw.write("NO");
            else
                bw.write("YES");

            bw.write("\n");
        }
        bw.flush();
        return;
    }
}
