package Collection.src.StreamsPractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class streamString {
    public static void main(String a[]){
        List<String> names = Arrays.asList("Masoombasha", "Vamsi", "Rangadu", "Kumar Babu", "Murali Sana");
        List<String> sorted = names.stream()
                                    .filter(strg -> strg.length() >=6 && strg.length()<=15)
                                    .collect(Collectors.toList());
        sorted.forEach(System.out::println);// here we can also without the argument

        List<String> sorted1 = names.stream().
                filter(str-> str.length()>=3 && str.length()<=10).collect(Collectors.toList());
    }
}
