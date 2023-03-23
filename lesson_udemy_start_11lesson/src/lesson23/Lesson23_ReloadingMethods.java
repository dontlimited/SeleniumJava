package lesson23;

public class Lesson23_ReloadingMethods {
    public static void main(String[] args) {

        int result;
        result= getSum(1,10);
        System.out.println(result);
        System.out.println();
        result = getSum(5,100,60);
        System.out.println(result);

        sayHello("petya");
        sayHello("QWE" , "RERER");

        int[] array = {1,22};
        int sum = getSum(array, "Oleg");

    }

    static int getSum(int[] array, String name){
        int sum = 0;
        for (int i = 0; i< array.length; i++){
            sum += array[i];
        }
        System.out.println("Hi " + name + "!");
        System.out.println("Your sum is " + sum);
        return sum;
    }
    static int getSum(int x, int y){
        int sum;
        sum = x+y;
        return sum;
    }
    static int getSum(int x, int y, int z){
        int sum;
        sum = x+y;
        return sum;

    }


    static void sayHello(String name){
        System.out.println();
        System.out.println("Hello " + name + "!");
        System.out.println("Im your program");
        System.out.println("Nice to meet yuo!");
        System.out.println();
    }

    static void sayHello(String name1, String name2){
        System.out.println();
        System.out.println("Hello " + name1 + "!");
        System.out.println("Hello " + name2 + "!");
        System.out.println("Im your program");
        System.out.println("Nice to meet yuo!");
        System.out.println();
    }

}
