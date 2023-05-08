package Collection.src.MapsInterface;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapPhonebook {
    public static void main(String a[]){
        Map<String , Integer> phonebook = new HashMap<>();
        phonebook.put("Masoom",986753746);
        phonebook.put("Basha",657534577);
        phonebook.put("Rang",457495773);
        phonebook.put("Megam",843578457);
        phonebook.put("Sush",783565684);
        System.out.println(phonebook.get("Megam"));//843578457
        Set<String> keys = phonebook.keySet();
        for(String i : keys) System.out.println(i +" : "+phonebook.get(i));
        /*Sush : 783565684
        Basha : 657534577
        Megam : 843578457
        Masoom : 986753746
        Rang : 457495773*/
    }
}
