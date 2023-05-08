package CoreJavaYouTube.collections;

import java.util.ArrayList;
import java.util.Collection;

public class collections {
    public static void main(String a[]){
        //Collection<Integer> nums = new ArrayList();
        Collection nums = new ArrayList();
        nums.add(2);// collection accepts repeated num's also
        nums.add(9);
        nums.add(7);
        nums.add(4);
        nums.add(7);
        //for(int n : nums) System.out.println(n);
        // If don't add the <Interger> beside the collection
        // we can't use the int in for loop in instead we have to Object
        for(Object n : nums) System.out.println(n);
    }
}
