package designpattern.adapter;

public class AdapterServiceA {
    ServiceA sa = new ServiceA();

    void runService() {
        sa.runServiceA();
    }
}
