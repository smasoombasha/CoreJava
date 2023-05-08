package Collection.src.HashSet;

import java.util.HashSet;
import java.util.Set;

public class HashSetInt {
    public static void main(String a[]){
        HashSet<Integer> even = new HashSet<Integer>();
        even.add(12);
        even.add(67);
        even.add(34);
        even.add(21);
        even.add(23);System.out.println(even);//[34, 67, 21, 23, 12]
        HashSet<Integer>  nums = new HashSet<>();//[34, 67, 21, 23, 55, 12, 77]
        nums.addAll(even);
        nums.add(34);
        nums.add(77);
        nums.add(55);System.out.println(nums);
        nums.remove(0); // Collections.sort is not available
        Set<Integer> num = new HashSet<>();
        num.addAll(nums);
        System.out.println(num);//[34, 67, 21, 23, 55, 12, 77]

    }
}
