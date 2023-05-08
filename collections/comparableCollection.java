package CoreJavaYouTube.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
// here we giving power to Students1 only to compare itself if we want to write our own logic inspite of
// giving power to Students1 then we write the Comparator logic 
class Students1 implements Comparable<Students1>{
    int age;
    String name;
    public Students1(int age, String name){
        this.age = age;
        this.name = name;
    }
    public String toString() {
        return "Students1{" +  "age=" + age + ", name='" + name + '\'' + '}';
    }
    public int compareTo(Students1 that){
        if(this.age > that.age) return 1; else return -1;
    }
}

public class comparableCollection {
    public static void main(String a[]){
        List<Students1> stud = new ArrayList<>();
        stud.add(new Students1(12,"Masoom"));
        stud.add(new Students1(43,"Ram"));
        stud.add(new Students1(23,"Sai"));
        stud.add(new Students1(22,"Gabriel"));
        stud.add(new Students1(32,"Snat"));

        Collections.sort(stud);
        System.out.println(stud);
        //[Students1{age=12, name='Masoom'}, Students1{age=22, name='Gabriel'}, Students1{age=23, name='Sai'}, Students1{age=32, name='Snat'}, Students1{age=43, name='Ram'}]
    }
}
