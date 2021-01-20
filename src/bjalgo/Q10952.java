package bjalgo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q10952 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        String input;
        StringTokenizer st;
        int num1, num2, sum;

        while ((input = br.readLine()) != null) {

            st = new StringTokenizer(input, " ");
            num1 = Integer.parseInt(st.nextToken());
            num2 = Integer.parseInt(st.nextToken());
            sum = num1 + num2;

            if(sum == 0)
                break;

            sb.append(sum + "\n");
        }
        System.out.println(sb);
    }
}
