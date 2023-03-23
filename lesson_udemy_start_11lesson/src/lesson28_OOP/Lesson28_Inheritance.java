package lesson28_OOP;
//наслідування//


public class Lesson28_Inheritance {

    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();

        cat.name = "maks";
        dog.name = "dima";

        cat.color = "White";
        dog.color = "Black";

        System.out.println();
        cat.walk("Backyard");
        dog.walk("Park");


        System.out.println();
        cat.feed("Milk");
        dog.sit();

        System.out.println();
        System.out.println("Cat name is "+ cat.name) ;
        System.out.println();
        System.out.println("Dog name is "+ dog.name) ;

        /////////////////
        System.out.println();
        System.out.println("Setter i Getter");

        dog.setWeight(2);
        System.out.println(dog.getWeight());



        System.out.println();
        System.out.println();
        dog.sound();
        cat.sound();
    }
}
