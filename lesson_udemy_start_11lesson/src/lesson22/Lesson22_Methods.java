package lesson22;

public class Lesson22_Methods {
    public static void main(String[] args) {

        int a = 13;
        int b = 3;

        int sum;
        sum = getSum(10,30);
        System.out.println(sum);
        System.out.println(getSum(2,5));

        System.out.println();
        showSum(10, 20,30);

        System.out.println();
        saySmth();

        System.out.println();
        sayHello("Maksym");

        System.out.println();
        String name = "Dima";
        sayHello(name);

        System.out.println();
        System.out.println();
        showSumToPerson("Sam", 15 , 25, 35);


        System.out.println();
        boolean result = showSumBool(1,3,4);
        System.out.println(result);
    }
    static int getSum(int x, int y){
        int sum ;
        sum = x+y;
        return sum;
    }

    static void showSum(int x, int y, int z){
        int sum = x+ y +z;
        System.out.println("Sum is " + sum);
    }
    static boolean showSumBool(int x, int y, int z){
        int sum = x+ y +z;
        System.out.println("Sum is " + sum);
        return true;
    }
    static void saySmth(){
        System.out.println("Hello");
        System.out.println("is running");
        System.out.println("You will see me");
    }

    static void sayHello(String name){
        System.out.println("Hello " + name + "!");
        System.out.println("I'm your program!");
    }

    static void showSumToPerson(String name, int a, int b, int c){
        sayHello(name);
        showSum(a,b,c);
        System.out.println("End of program");
    }
}
