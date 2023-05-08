package Collection.src.StreamsPractice;

import java.util.*;
import java.util.stream.Collectors;

public class streamInteger {
    public static void main(String[] args){
        List<Integer> nums = Arrays.asList(12,32, 34, 22, 11, 21, 8);
        List<Integer> sortedNums = new ArrayList<>();
        sortedNums = nums.stream()
                . filter(n -> n%2==0)
                .collect(Collectors.toList());// collect is method, Collectors is Class, toList is method
        sortedNums.forEach(n -> System.out.print(" "+n));// 12 32 34 22 8 only even numbers
        System.out.println();
        //Set<Integer> sort = nums.stream().map(s->s%2==0).collect(Collectors.toSet()); it doesn't support for boolean it supports only Integer
        Set<Integer> sort = nums.stream().map(s->s*s).collect(Collectors.toSet());
        //System.out.println(sort);
        Iterator it = sort.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println(nums.stream().filter(n -> n % 2 == 0).collect(Collectors.toSet()));//[32, 34, 22, 8, 12]
        System.out.println(nums.stream().sorted().collect(Collectors.toList()));//[8, 11, 12, 21, 22, 32, 34]

        Collections.sort(nums);
        System.out.println(nums);
    }
}
