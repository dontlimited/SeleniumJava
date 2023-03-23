package lesson28_OOP;

public class Cat extends Animal{
    public Cat(){
        System.out.println("New Cat created");
    }
    public void feed(String feed){
        System.out.println("I like " + feed);
    }
    @Override
    public void sound(){
        System.out.println("Meow Meow");
    }
}
