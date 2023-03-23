package lesson27;

public class Car {

    final int var = 10;
    static  void method(){
        System.out.println("method");
    }

    int height;
    int wigth;
    int length;
    int weight = 2000;
    int maxWeight= 2700;
    String color;
    int speed;
    int maxSpeed = 260;

    public void addWeight(int weight){
        this.weight += weight;
        System.out.println("New weight: " + this.weight);
    }

    public void drive(int speed){
        if (weight <= maxWeight) {
        this.speed = speed;
            System.out.println("Speed = " + speed);
        }else {
            System.out.println("Can not drive");
        }
    }
}
