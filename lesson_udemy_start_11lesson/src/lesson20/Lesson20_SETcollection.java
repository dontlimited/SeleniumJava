package lesson20;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Lesson20_SETcollection {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(11);
        set.add(12);
        set.add(11);

        set.remove(11);

        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println();
        System.out.println();
        System.out.println();

        for (int i : set) {
            System.out.println(i);
        }
        System.out.println();


        //set.clear();
        System.out.println(set.size());

        System.out.println(set.contains(10));
        System.out.println(set.contains(11));

    }
}
