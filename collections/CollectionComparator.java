package CoreJavaYouTube.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

public class CollectionComparator {
    public static void main(String a[]){
        // If we have our own logic to Sort we use the Comparator
        Comparator<Integer> com = new Comparator<Integer>(){
            public int compare(Integer i, Integer j){
                //if(i%10 > j%10) return 1; else return -1;//[21, 13, 45, 65, 6]
                if(i>j) return 1; else return -1;//[6, 13, 21, 45, 65]
            }
        };
        List<Integer> nums = new ArrayList<>();
        nums.add(65);
        nums.add(13);
        nums.add(21);
        nums.add(45);
        nums.add(6);
        System.out.println(nums);//[65, 13, 21, 45, 6]
        // use Collection.sort();we will get in the sorted format
        // Collection -- interface
        // Collections -- Class
        Collections.sort(nums, com);
        System.out.println(nums);//[6, 13, 21, 45, 65]

        System.out.println("--------------------------------------------------");
        Comparator<Integer> com1 = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
              if(o1 == o2)  return -1; else return 1;
            }
        };
        Collections.sort(nums, com1);
        System.out.println(nums);
    }
}
