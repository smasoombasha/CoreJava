package Collection.src.MapsInterface;

import java.util.Hashtable;
import java.util.Map;

public class HashMapTableProgram {
    public static void main(String a[]){
        // it is synchronized and thread safe bcoz it connot allows threads to access methods at time. it allows only
        // one thread after one thread so it is synchronized
        Hashtable<String , Integer> pbook= new Hashtable<>();
        pbook.put("Masom",987539847);
        pbook.put("Basha",987645097);
        pbook.put("Lokesh",987943857);
        pbook.put("Babu",343463534);
        pbook.put("Vamdi",456745657);
        System.out.println(pbook);//{Lokesh=987943857, Vamdi=456745657, Basha=987645097, Babu=343463534, Masom=987539847}
        // Entry Method
        for(String all : pbook.keySet()){// Inspite of String we can use Object also
            System.out.println(all+" : "+pbook.get(all));
        }
        System.out.println("---------------------------------------------------------------------");
        for(Map.Entry entry : pbook.entrySet()){
            System.out.println(entry.getKey() +" | "+entry.getValue());
        }
      /*  Lokesh : 987943857
        Vamdi : 456745657
        Basha : 987645097
        Babu : 343463534
        Masom : 987539847*/

    }
}
