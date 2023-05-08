package Collection.src.List;
import java.util.LinkedList;
public class linkedList {
    public static void main(String a[]){
        LinkedList ll = new LinkedList();
        LinkedList lldup = new LinkedList();
        ll.add(23);
        ll.add("Masoom");
        ll.add("Shine");
        ll.add('A');
        ll.add(false);
        lldup.add(ll);// coping all the elements from ll to lldup
        lldup.forEach(System.out::print);//[23, Masoom, Shen, A, false]
        System.out.println();
        lldup.add(0,"Added");//[Added, [23, Masoom, Shen, A, false]]
        lldup.addAll(ll);//[Added, 23, Masoom, Shine, A, false]
        // the above is different bcoz we just add "Added" at index 0 it show at index. And we add the ll elements into
        // the lldup but , it stored at one node only.
        System.out.println(lldup);
       /* lldup.remove(1);
        System.out.println(lldup);*/

    }
}
