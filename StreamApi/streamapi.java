package CoreJavaYouTube.StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class streamapi {
    public static void main(String a[]){
       /* List<Integer> nums = new ArrayList<>();
        nums.add(19);
        nums.add(32);
        nums.add(12);
        nums.add(3);
        nums.add(4);
        nums.add(19);
        System.out.println(nums);//[19, 32, 12, 3, 4, 19]*/

        // Instead of example we can use below example for elements in the array
        List<Integer> nums = Arrays.asList(19, 32, 12, 3, 4, 19);
       /* for(int n: nums) {
            if(n%2==0) System.out.println(n*2);//64 24 8
        }
        System.out.println(nums);//[19, 32, 12, 3, 4, 19]*/

        // instead of using the original elements of array list and effecting them. Inspite of this we can
        // use the Stream. It works as first Stream copies all values and it performs operations on it.
        // and the original values can't be effected it will stays safe.
        // You know that once u use the stream. we cant re-use it
        Stream<Integer> s1 = nums.stream();
        s1.forEach(n -> System.out.println(n));//[19, 32, 12, 3, 4, 19]
        Stream<Integer> s2 = nums.stream();
        s2.forEach(n -> System.out.println(n*2));//38 64  24 6 8 38
        //s1.forEach(n -> System.out.println(n*4)); it doesn't work becoz s1 is used once

        // filters
        Stream<Integer> s3 = nums.stream()
                                 .filter(n -> n%2==0);
        s3.forEach(n -> System.out.println(n));// 32 12 4
        // if we have multiple threads we us nums.parellelStream();
    }
}
