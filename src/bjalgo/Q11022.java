package bjalgo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q11022 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int repeat = Integer.parseInt(br.readLine());
        String input;
        int num1, num2;
        
        for(int i = 1; i <= repeat; i++) {
            input = br.readLine();
            num1 = input.charAt(0) - '0';
            num2 = input.charAt(2) - '0';
            sb.append("Case #").append(i).append(": ").append(num1).append(" + ").append(num2).append(" = ").append(num1 + num2).append("\n");
        }
        System.out.print(sb);
    }
}