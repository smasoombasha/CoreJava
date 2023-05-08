package CoreJavaYouTube.collections;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class collectionset {
    public static void main(String a[]){
        // The Set doesn't give the repeated values and they not in squence
        // what we have entered, HashSet is gives the output in unsorted get sorted we use TreeSet();
        //Set<Integer> nums = new HashSet<>();
        Set<Integer> nums = new TreeSet<>();
        nums.add(12);
        nums.add(34);
        nums.add(25);
        nums.add(45);
        nums.add(57);
        //for(int n : nums) System.out.println(n);
        // while if we want ouput in sorted we create TreeSet();
        // obj instead HashSet()
        // On the top of collection we have ITERATOR we use that here to get output
        Iterator<Integer> values = nums.iterator();
        // hasNext() meth tells it has next num or not
        // And output is in sorted
        // here next(); gives the next num output
         while(values.hasNext()) System.out.println(values.next());

        /*for (int n: nums)
            System.out.println(n);*/


    }
}
