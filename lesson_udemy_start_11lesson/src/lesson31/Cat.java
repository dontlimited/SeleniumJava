package lesson31;

public class Cat extends Animal{

    @Override
    public void saySmth() {
        System.out.println("Meow");
    }

    @Override
    public void eat() {
        System.out.println("I like milk");
    }
}
