package lesson26;

public class Car {
    public Car(){
        System.out.println("New car created");
    }
    public Car(String color){
        System.out.println("New car created");
        this.color = color;
    }

    public Car(String color, int height, int width, int length){
        System.out.println("New car created");
        this.color = color;
        this.height = height;
        this.wigth = width;
        this.length = length;
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
