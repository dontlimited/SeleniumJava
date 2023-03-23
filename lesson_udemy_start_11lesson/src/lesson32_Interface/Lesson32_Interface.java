package lesson32_Interface;

public class Lesson32_Interface {
    public static void main(String[] args) {

        Car car = new Car();
        Plane plane = new Plane();

        car.go();
        car.stop();
        System.out.println();
        System.out.println();
        plane.go();
        plane.stop();
        System.out.println();
        plane.setSpeed(500);

        car.method1();
        car.method2();
    }
}
