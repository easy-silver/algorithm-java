package bjalgo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q11718 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 100;
        String input;
        
        while ((input = br.readLine()) != null) {
            System.out.println(input);
            if(count-- < 0)
                break;
        }
        
    }
}
