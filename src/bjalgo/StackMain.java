package bjalgo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StackMain {

    public static void main(String[] args) throws IOException {

        int repeat, pointer = 0, param, result = 0;
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        repeat = Integer.parseInt(bf.readLine());
        int[] stack = new int[repeat];

        String str, cmd;
        String[] inputs;

        for (int i = 0; i < repeat; i++) {
            param = 0;
            str = bf.readLine();
            inputs = str.split(" ");
            cmd = inputs[0];
            if (inputs.length >= 2) {
                param = Integer.parseInt(inputs[1]);
            }
            switch (cmd) {
                case "push":
                    stack[pointer++] = param;
                    break;
                case "pop":
                    if(pointer <= 0)
                        result = -1;
                    else
                        result = stack[--pointer];
                    System.out.println(result);
                    break;
                case "size":
                    result = pointer;
                    System.out.println(result);
                    break;
                case "empty":
                    if(pointer <= 0)
                        result = 1;
                    else
                        result = 0;
                    System.out.println(result);
                    break;
                case "top":
                    if(pointer <= 0)
                        result =  -1;
                    else
                        result = stack[pointer-1];
                    System.out.println(result);
                    break;
            }
        }
    }
}
