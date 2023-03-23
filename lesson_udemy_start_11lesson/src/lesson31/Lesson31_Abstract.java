package lesson31;

public class Lesson31_Abstract {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();


        dog.walk("Park");
        dog.saySmth();

        System.out.println();

        cat.walk("Backyard");
        cat.eat();
    }
}
