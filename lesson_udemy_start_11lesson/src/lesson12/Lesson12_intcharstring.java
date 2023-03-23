package lesson12;

public class Lesson12_intcharstring {
    public static void main(String[] args) {
        byte a = 5; // -128 127
        short b = -100; //-32758 32767
        int c;
        c = 1000000;
        long d = -1111111;
        System.out.println(a);
        System.out.println("short b:" + b);

        double double1 = 133.3;
        System.out.println(double1);
        float float1 = 150.32f;

        boolean boolean1 = true;
        boolean boolean2 = false;
        System.out.println(boolean1);
        System.out.println(boolean2);

        boolean boolean3 = 1+ 2> 0;
        boolean boolean4 = 1 + 2 >5;
        System.out.println(boolean3);
        System.out.println(boolean4);

        String str = "Hello ";
        String str1 = "world";
        System.out.println(str + str1);

        char char1 = 'r';
        System.out.println(char1);
    }
}
