package bjalgo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q10818 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        int size = Integer.parseInt(br.readLine());
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        Integer[] numberArr = new Integer[size];
        
        for(int i = 0; i < numberArr.length; i++) {
            numberArr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(numberArr);
        
        sb.append(numberArr[0]).append(" ").append(numberArr[numberArr.length-1]);
        bw.write(sb.toString());
        
        bw.close();
        br.close();
    }
}
