package HashSet;

import java.util.LinkedHashSet;

public class LinkedHashSetProgram {
    public static void main(String a[]){
        LinkedHashSet<Integer> set1 = new LinkedHashSet<>();
        //HashSet<Integer> set1 = new HashSet<>();//[400, 100, 500, 200, 300] in Hashset insertion Order is not preserved
        set1.add(100);
        set1.add(300);
        set1.add(200);
        set1.add(400);
        set1.add(500);
        System.out.println(set1);//[100, 300, 200, 400, 500] LinkedHashSet insertion order preserved
        // this is main difference in Hashset and LinkedHashSet
    }
}
