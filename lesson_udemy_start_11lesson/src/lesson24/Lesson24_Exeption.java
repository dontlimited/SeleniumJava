package lesson24;

public class Lesson24_Exeption {
    public static void main(String[] args) {

    try {
        devide(10,0);
    } catch (ArithmeticException e){
        e.printStackTrace();
    }finally {
        System.out.println("End");
    }
    }
    public static void devide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Can't devide by zero");
        } else {
            System.out.println("result is " + a/b);
        }
    }

    public static void devide_Example(int a, int b){
        try {
        System.out.println("Result is: " + a/b);
        } catch (ArithmeticException e){
            System.out.println("Problem!");
        } finally {     //не обовязковий
            System.out.println("Finish");
        }
    }
}
