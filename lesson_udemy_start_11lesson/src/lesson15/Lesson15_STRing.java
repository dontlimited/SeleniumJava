package lesson15;

public class Lesson15_STRing {
    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println(s.equals("Hello World"));
        System.out.println(s.equals("Hello"));

        System.out.println();
        String s2 = "Hello";
        System.out.println(s.equals(s2));
        System.out.println();

        s= "text";
        s2 ="TEXT";

        System.out.println(s.equalsIgnoreCase(s2));

        System.out.println();
        s = "TeXt";
        System.out.println(s);
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());

        System.out.println();

        System.out.println(s.charAt(1));
        System.out.println(s.indexOf("Xt"));
        System.out.println();

        s = "Hello, World";
        System.out.println(s.contains("Hello"));
        System.out.println(s.contains("Text"));

        System.out.println();

        System.out.println(s.length());
        System.out.println();

        System.out.println(s.startsWith("Hello"));
        System.out.println(s.startsWith("he"));
        System.out.println(s.endsWith("d"));

        System.out.println();
        s = "hello, world";
        String[] array = s.split(",");
        System.out.println(array[0] + "!" + array[1] + "!");

        System.out.println();
        System.out.println(array[0]);
        System.out.println(array[1]);


        System.out.println();
        System.out.println();

        String str = "My name is %s!, I'm %d years old!";
        int age =30;
        String name = "Ivan";
        System.out.println(String.format(str, name, age));
        System.out.println(String.format(str, "Maks", 19));

        System.out.println();
        String age2 = "30";
        int a = Integer.parseInt(age2);
        System.out.println(a * 3);

        s = "Hello, world!";
        System.out.println(s.substring(1,5)); //important
        System.out.println(s.substring(7));


        System.out.println();
        System.out.println(s.substring(7,s.length()-2));


        System.out.println();

        String s1 = "Hello ";
        s2 = "world";
        String s3 = "!";
        String res;
        res = s1 + s2 +s3;
        System.out.println(res);

        System.out.println();


        res = s.concat(s2).concat(s3); //ne ponyav
        System.out.println(res);
    }
}
