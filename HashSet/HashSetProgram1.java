package HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetProgram1 {
    public static void main(String a[]){
        HashSet hs = new HashSet();
        hs.add(23);
        hs.add("Mas");
        hs.add('A');
        hs.add(null);
        hs.add(true);
        hs.add(20);// Using iterator to print all the values
        Iterator it = hs.iterator();
        while(it.hasNext()){// null A 20 23 Mas true
            System.out.print(" "+it.next());
        }
        System.out.println(hs.contains("Mas"));//true
        System.out.println(hs.isEmpty());// false

        Iterator it1= hs.iterator();
        while (it1.hasNext()){
            System.out.println(it1.next());
        }

    }
}
