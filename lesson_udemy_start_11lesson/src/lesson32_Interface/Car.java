package lesson32_Interface;

public class Car implements Transport, Interface{

    @Override
    public void go() {
        System.out.println("We are driving");
    }

    @Override
    public void stop() {
        System.out.println("We are driving slower");
    }

    @Override
    public void method1() {
        System.out.println("Tesr1");
    }

    @Override
    public void method2() {
        System.out.println("Test2");
    }
}
