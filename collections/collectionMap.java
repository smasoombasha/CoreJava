package CoreJavaYouTube.collections;

import java.util.HashMap;
import java.util.Map;

public class collectionMap {
    public static void main(String a[]){
        // Map is not an implementation or it does not extend any interface or class
        // but, it is apart in collection related to API
        // Instead of index nums we can give the names that will done with help of Maps
        // Maps have a concept of keys and value pair.
        Map<String , Integer> stud = new HashMap<>();
        // If we working with multiple threads it is better go with Hashtable();
        // becoz it is Sychronized
        stud.put("Masoom",77);
        stud.put("Siva",23);
        stud.put("Ranga",56);
        stud.put("Vamsi",87);
        stud.put("Rama",66);
        // key doesn't get duplicate. It is unique. So value of Masoom is changed to 99 inspite of 77
        stud.put("Masoom",99);
        // we can't use the add here becoz it doesn't replace the duplicates
        // and also map cannot support the add();
       // stud.add("Masoom",67);
        System.out.println(stud.get("Masoom"));// stud.get();gives, if we enter the key we get the value
        for (String key : stud.keySet())
            System.out.println(key+ " : "+stud.get(key));
        System.out.println(stud.toString());
        System.out.println(stud.keySet());
    }
}
