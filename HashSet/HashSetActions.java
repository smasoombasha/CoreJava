package Collection.src.HashSet;

import java.util.HashSet;

public class HashSetActions {
    public static void main(String a[]){
        HashSet<Integer> hs = new HashSet<>();
        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(4);
        hs.add(5);
        HashSet<Integer> hs1 = new HashSet<>();
        hs1.add(3);
        hs1.add(4);
        hs1.add(5);
        hs1.add(6);
        // Union : it prints only unique digits
        /*hs.addAll(hs1);
        System.out.println(hs);*///[1, 2, 3, 4, 5, 6]

        //Intersection : it prints only hs1 set elements which finds similar from hs set
        /*hs.retainAll(hs1);
        System.out.println(hs);*///[3, 4, 5]

        // Difference : it prints only not similar elements
        hs.removeAll(hs1);
        System.out.println(hs);//[1, 2]

    }
}
