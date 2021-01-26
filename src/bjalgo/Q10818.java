package bjalgo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q10818 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        int size = Integer.parseInt(br.readLine());
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] numberArr = new int[size];
        
        for(int i = 0; i < numberArr.length; i++) {
            numberArr[i] = Integer.parseInt(st.nextToken());
        }
        
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        
        for(int target : numberArr) {
            if(min > target)
                min = target;
            
            if(max < target)
                max = target;
        }
        
        sb.append(min).append(" ").append(max);
        bw.write(sb.toString());
        
        bw.close();
        br.close();
    }
}
