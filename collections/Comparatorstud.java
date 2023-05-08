package CoreJavaYouTube.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Students{
    int age;
    String name;
    public Students(int age , String name){
        this.age = age;
        this.name= name;
    }
    public String toString() {
        return "Students{" +  "age=" + age +  ", name='" + name + '\'' + '}';
    }
}

public class Comparatorstud {
    public static void main(String a[]){
        // creating comparator for students to sort out students with age
       /* Comparator<Students> com = new Comparator<Students>() {
            public int compare(Students i, Students j) {
                if(i.age > j.age) return 1; else return -1;
            }
        };*/ // with Lamda Expression
        Comparator<Students> com =  (i,j) -> {
                if(i.age > j.age) return 1; else return -1;
            };
        List<Students> stud = new ArrayList<>();
        stud.add(new Students(12,"Masoom"));// add key and values to constructor
        stud.add(new Students(26,"sai"));
        stud.add(new Students(13,"Raj"));
        stud.add(new Students(32,"Ranga"));
        stud.add(new Students(25,"Ram"));
        System.out.println(stud);// output with out comparator
        //[Students{age=12, name='Masoom'}, Students{age=26, name='sai'}, Students{age=13, name='Raj'}, Students{age=32, name='Ranga'}, Students{age=25, name='Ram'}]
        Collections.sort(stud, com);
        System.out.println(stud);// output
        //[Students{age=12, name='Masoom'}, Students{age=13, name='Raj'}, Students{age=25, name='Ram'}, Students{age=26, name='sai'}, Students{age=32, name='Ranga'}]

    }
}
