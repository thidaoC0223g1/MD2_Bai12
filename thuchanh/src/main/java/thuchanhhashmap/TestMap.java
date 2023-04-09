package thuchanhhashmap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String,Integer> hashMap= new HashMap<>();
        hashMap.put("tien",2001);
        hashMap.put("hung",1997);
        hashMap.put("giang",1992);
        hashMap.put("van",1990);
        hashMap.put("son",1993);
        System.out.println("hien thi bang ghi trong Hashmap");
        System.out.println(hashMap+"\n");

//        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
//        System.out.println("Display entries in ascending order of key");
//        System.out.println(treeMap);
//
//        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
//        linkedHashMap.put("Smith", 30);
//        linkedHashMap.put("Anderson", 31);
//        linkedHashMap.put("Lewis", 29);
//        linkedHashMap.put("Cook", 29);
//        System.out.println("\nThe age for " + "Lewis is " + linkedHashMap.get("Lewis"));


//        System.out.println(hashMap.get("son"));
//        System.out.println(hashMap.containsKey("van"));
        System.out.println(hashMap.size());
        System.out.println(hashMap.remove("van"));
        System.out.println(hashMap);
        System.out.println(hashMap.keySet());
        System.out.println(hashMap.values());
        System.out.println(hashMap.entrySet());

    }

}
