package lesson26;

public class Lesson26_Constructor {
    public static void main(String[] args) {
        //class - опис обєктів

        Car RX7 = new Car();
        RX7.color = "Black";
        RX7.length = 5000;
        RX7.height = 2000;
        RX7.wigth = 2000;

        RX7.addWeight(50);
        RX7.drive(120);

        System.out.println();

        RX7.addWeight(700);
        RX7.drive(120);


        System.out.println();
        System.out.println();


        Car car2 = new Car();
        car2.color = "White";
        car2.drive(200);
        System.out.println(car2.color);

        System.out.println();
        System.out.println();

        Car car4 = new Car("Black");
        System.out.println("Car color is: " + car4.color);

        System.out.println();
        System.out.println();

        Car car5 = new Car("Red", 2100, 2000,5100);
        System.out.println(car5.color + " " + car5.height + " " + car5.wigth + " " + car5.length);

    }
}
