package designpattern.adapter;

public class ClientWithNoAdapter {
    public static void main(String[] args) {
        ServiceA sa = new ServiceA();
        ServiceB sb = new ServiceB();

        sa.runServiceA();
        sb.runServiceB();
    }
}
