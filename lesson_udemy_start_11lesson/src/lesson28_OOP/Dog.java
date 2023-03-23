package lesson28_OOP;

public class Dog extends Animal {
    public Dog(){
        System.out.println("New dog created");
    }
    private int weight;
    //setter i getter
    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    ///
    public void sit(){
        System.out.println("I'm sitting");
        var = 20;
    }

    public void lay(){
        System.out.println("I'm laying");
    }


}
