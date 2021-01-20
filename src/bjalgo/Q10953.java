package bjalgo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q10953 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        StringTokenizer st;
        int repeat = Integer.parseInt(br.readLine());
        String input;
        int num1, num2;

        while (repeat-- > 0) {
            input = br.readLine();
            st = new StringTokenizer(input, ",");
            num1 = Integer.parseInt(st.nextToken());
            num2 = Integer.parseInt(st.nextToken());
            sb.append(num1 + num2 + "\n");
        }
        System.out.print(sb);
    }
}