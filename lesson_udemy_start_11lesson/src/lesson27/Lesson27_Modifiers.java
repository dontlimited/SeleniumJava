package lesson27;

public class Lesson27_Modifiers {
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
        System.out.println("____-modifikators-____");
        System.out.println();

      //  System.out.println(Car.var);
       // Car.var = 100;


        System.out.println();
        System.out.println(car2.var);
        System.out.println(RX7.var);

        System.out.println();
        Car.method();

        System.out.println();

        String.format("New %s string", "string");

    }
}
