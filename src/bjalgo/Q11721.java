package bjalgo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 열 개씩 끊어 출력하기
 * @author Timo
 *
 */
public class Q11721 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String input = br.readLine();
        
        for(int i = 1; i <= input.length(); i++) {
            sb.append(input.charAt(i-1));
            if(i % 10 ==  0)
                sb.append("\n");
        }
        System.out.print(sb);
    }

}
