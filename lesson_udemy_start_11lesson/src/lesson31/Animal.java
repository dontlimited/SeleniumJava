package lesson31;

public abstract class Animal {
    public abstract void saySmth();
    public abstract void eat();

    public void walk(String place){
        System.out.println("I'm walking here " + place);
    }
}
