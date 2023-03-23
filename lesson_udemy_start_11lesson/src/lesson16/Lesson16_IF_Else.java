package lesson16;

public class Lesson16_IF_Else {
    public static void main(String[] args) {
        int i = 1;
        System.out.println("start of program");
        if (i >10) {
            System.out.println("i > 10");
            i++;
            System.out.println(i);
        } else if (i<10 && i>5){
            System.out.println("i <=10 and i >5");
            i--;
            System.out.println(i);
        }
        else {
            System.out.println("Nothing");
        }
        System.out.println("end of program");

        System.out.println();
        System.out.println();

        i = 40;
        if (i >50 ) {
            System.out.println("i>50");
            if (i >90) {
                System.out.println("i>90");
            }
            else {
                System.out.println("i<90");
            }
        }
        else {
            System.out.println("i <=50");
        }
        i=2;
        switch (i){
            case 1:
                System.out.println("the number is 1");
                break;
            case 2:
                System.out.println("the number is 2");
                break;
            case 3:
                System.out.println("the number is 3");
                break;
            default:
                System.out.println("I dont know the number");
        }


    }
}
