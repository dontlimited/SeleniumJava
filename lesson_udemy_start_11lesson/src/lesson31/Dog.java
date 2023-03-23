package lesson31;

public class Dog extends Animal{
    @Override
    public void saySmth() {
        System.out.println("Wof wof");
    }

    @Override
    public void eat() {
        System.out.println("I like meat");
    }

    public void sit(){
        System.out.println("I'm sitting");
    }
}
