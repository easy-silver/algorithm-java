package bjalgo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q2441 {

    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        
        int count = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < count; i++) {
            for(int k = 0; k < i; k++) {
                sb.append(" ");
            }
            for(int j = count - i; j > 0; j--) {
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
