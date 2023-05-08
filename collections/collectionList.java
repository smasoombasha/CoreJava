package CoreJavaYouTube.collections;

import java.util.ArrayList;
import java.util.List;

public class collectionList {
    public static void main(String a[]){
        List<Integer> nums = new ArrayList<>();
        nums.add(9);
        nums.add(7);
        nums.add(4);
        nums.add(7);
        // In collection interface we dont have index
        // in List we have index nums with this we can call elements
        System.out.println(nums.get(4));
        for(int n : nums)
            System.out.println(nums);
    }
}
