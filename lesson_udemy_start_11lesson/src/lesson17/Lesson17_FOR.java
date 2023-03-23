package lesson17;

public class Lesson17_FOR {
    public static void main(String[] args) {
        System.out.println("start");

        for (int i = 0; i < 5; i++) {
            System.out.println(i + " = i");
        }
        System.out.println();
        System.out.println();


        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = i*2;

        }
        System.out.println();
        System.out.println();
        System.out.println();

        for (int i = 0; i < 10; i++) {
            System.out.println("Element with index " + i + " is: " + array[i]);
        }
        System.out.println();
        System.out.println();

        for(int element: array){
            System.out.println(element);
        }

        System.out.println();
        System.out.println();
        System.out.println();
        int i = 0;
        boolean bool = true;
        while (bool){
            System.out.println("while: "+ i);
            i++;
            if (i == 5) bool = false;
        }
        i = 0;
        do {
            System.out.println("do" + i);
            i++;
        } while (i<5);
    }
}
