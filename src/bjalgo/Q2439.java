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
        //StringBuilder sb = new StringBuilder();
        
        int count = Integer.parseInt(br.readLine());
        int whitespace = count-1, star = count - whitespace;
        
        for(int i = 0; i < count; i++) {
            for(int j = whitespace; j > 0; j--) {
                //sb.append(" ");
                bw.write(" ");
            }
            for(int k = 0; k < star; k++) {
                //sb.append("*");
                bw.write("*");
            }
            whitespace--;
            star++;
            //sb.append("\n");
            bw.newLine();
        }
        //System.out.print(sb);
        bw.flush();
        long et = System.currentTimeMillis();
        System.out.println((et - st)+" ms");
    }
}
