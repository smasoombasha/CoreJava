package Collection.src.List;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {
    public static void main(String a[]){
        List ll =  new LinkedList();
        ll.add(4);
        ll.add(10);
        ll.add(7);
        ll.add(9);
        System.out.println(ll);//[4, 10, 7, 9]
        List lldup = new LinkedList();
        lldup.addAll(ll);lldup.add(0,"first");
        System.out.println(lldup);//[first, 4, 10, 7, 9]
        lldup.removeAll(lldup);
        System.out.println(lldup);//[] it removes all
        Collections.sort(ll);
        System.out.println(ll);//[4, 7, 9, 10]
        Collections.sort(ll, Collections.reverseOrder());


    }
}
