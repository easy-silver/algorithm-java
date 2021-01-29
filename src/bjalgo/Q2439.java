package bjalgo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q2439 {

    public static void main(String[] args) throws Exception {
        long st = System.currentTimeMillis();
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int count = Integer.parseInt(br.readLine());
        
        for(int i = 1; i <= count; i++) {
            for(int j = 0; j < count - i; j++) {
                bw.write(" ");
            }
            for(int k = 0; k < i; k++) {
                bw.write("*");
            }
            bw.append("\n");
        }
        bw.flush();
        long et = System.currentTimeMillis();
        System.out.println((et - st)+" ms");
    }
}
