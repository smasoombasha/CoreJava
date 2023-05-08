package Collection.src.MapsInterface;

import java.util.HashMap;
import java.util.Map;

public class HashMapProgram {
    public static void main(String a[]){
        // In the HashSet insertion order is not preserved
        HashMap<Integer, String> hsm1 = new HashMap<>();
        HashMap<Integer, String> hsm = new HashMap<>();
        hsm.put(101, "Masoom");
        hsm.put(102, "Siva");
        hsm.put(103, null);
        hsm.put(104, null);
        hsm.put(105, "Pawan");
        hsm.put(null,"basha");// it supports only one null as key, but it supports n values as null bcoz it supports
        // duplicates as values only.
        System.out.println(hsm);//{101=Masoom, 102=Siva, 103=Ranga, 104=Mahesh, 105=Pawan}
     /*   for(int n : hsm.keySet()){
            System.out.println(n+" : "+hsm.get(n));
        }
       *//* 101 : Masoom
        102 : Siva
        103 : Ranga
        104 : Mahesh
        105 : Pawan*/
        // In Entry set method
        for(Map.Entry entry : hsm.entrySet()){// we will get a same output as above
          /*  Object n = entry.getKey();
            Object m = entry.getValue();
            System.out.println(n+" : "+m);*/
            System.out.println(entry.getKey() +" : "+entry.getValue());
        }
        // Second HashMap
        hsm1.putAll(hsm);
        hsm1.put(110,"Naresh");
       /* hsm1.remove(102);
        System.out.println(hsm1);
        hsm1.put(103,"Sam");
        System.out.println(hsm1);
        hsm1.remove(hsm);
        System.out.println(hsm1);*/
        // Entry set methods
        Object entry = hsm1.entrySet();
        System.out.println(entry);// [104=Mahesh, 105=Pawan, 101=Masoom, 102=Siva, 110=Naresh, 103=Ranga]
        System.out.println(hsm1.entrySet());//[104=Mahesh, 105=Pawan, 101=Masoom, 102=Siva, 110=Naresh, 103=Ranga]
        System.out.println(hsm1.keySet());//[104, 105, 101, 102, 110, 103]
        System.out.println(hsm1.values());//[Mahesh, Pawan, Masoom, Siva, Naresh, Ranga]
        for(Map.Entry entry2 : hsm.entrySet()){
            System.out.println(entry2.getKey()+"  :  "+entry2.getValue());
        }
        System.out.println("--------------------------------------------");
        for (Map.Entry entry1 : hsm1.entrySet()){
            System.out.println(entry1.getKey() +" | "+ entry1.getValue());
        }

    }
}
