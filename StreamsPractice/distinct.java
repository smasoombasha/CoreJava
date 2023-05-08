package StreamsPractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class distinct {
    public static void main(String a[]){
        List<Integer> nums = Arrays.asList(12,22,33,80,45, 12,33);
        List<Integer> sorted = nums.stream().distinct().collect(Collectors.toList());// distinct keyword is used to eliminate duplicate values
        nums.forEach(n -> System.out.print(" "+n));// 12 22 33 80 45 12 33
        System.out.println();
        sorted.forEach(n->System.out.print(" "+n));//12 22 33 80 45


    }
}
