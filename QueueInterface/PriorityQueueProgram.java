package Collection.src.QueueInterface;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueProgram {
    public static void main(String a[]){
        /* And the PriorityQueue is not supports Heterogeneous data but
        LinkedList supports the Heterogeneous data.
         */
        //Queue pq = new LinkedList();  // insertion order is preserved
        Queue pq = new PriorityQueue(); // insertion order is not preserved
        pq.offer('a');
        pq.add('o');
        pq.add('v');
        pq.add('s');// add() method is used to add the elements at tail it sucessul it returns true
        pq.add('f');// if it is not sucessful it throws exception
        pq.add('z');
        pq.offer('o'); // and also offer() is same as add() but is not sucessful to add then it returns false, it is sucessful returns true
        System.out.println(pq);//[a, f, o, s, o, z, v]
        //element() is used to get head element from queue. if succesful to return if returns true
        System.out.println(pq.element());// a
        // peek() also same as element() methods. if not succesful to return if returns exception
        System.out.println(pq.peek());// a
        //remove() method is used to return head element and it will remove as well
        pq.remove();
        System.out.println(pq);// Out put - [f, o, o, s, v, z]
        // poll() method also same as remove().
        pq.poll();
        System.out.println(pq);//[o, s, o, z, v]
        System.out.println("----------------------------------------------------");
        Queue<Character>  pq1 = new LinkedList(pq);
        System.out.println(pq1);
        System.out.println(pq1.peek());
        pq1.offer('m');
        pq1.poll();
        System.out.println(pq1);

    }
}
