package lesson28_OOP;

public class Animal {
    protected String name;
    protected String color;

    protected int var;

    public void walk(String place){
        System.out.println("We are walking here " + place);
    }

    public void sleep(){
        System.out.println("Sleeping Zzzz");
    }



    public void sound(){
        System.out.println("Hello!");
    }
}
