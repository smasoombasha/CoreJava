package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
public class arrayList {
    public static void main(String a[]){
        List al = new ArrayList<>();
        al.add(12);
        al.add("Ajay");
        al.add(true);
        al.add(35);
        al.add('Q');
        al.add("Naresh");
        List alDup = Arrays.asList(al);// copying objects or elements of another list
        System.out.println(al);//[12, Ajay, true, 35, Q, Naresh]
        // after removing
        al.remove(3);
        System.out.println(al);//[12, Ajay, true, Q, Naresh]
        al.set(2,false);al.add(5,"ArrayList");
        System.out.println(al);//[12, Ajay, false, Q, Naresh, ArrayList]
        /*Collections.sort(alDup);
        System.out.println(alDup);
        it works for only same data types only*/
        //Itereator
        Iterator it = al.iterator();
        while (it.hasNext()){
            System.out.print(" "+it.next());//12 Ajay false Q Naresh ArrayList
        }System.out.println();
        // Enhanced Loop
        for(Object n : al){
            System.out.print(" "+n);//12 Ajay false Q Naresh ArrayList
        }System.out.println();
        // forEach Loop
        al.forEach(System.out::println);// or forEach(n -> System.out.println(n));
        //12 Ajay false Q Naresh ArrayList


    }
}
