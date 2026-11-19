package org.example;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapAndMapOf {
    static void main(String[] args) {

        //HashMap
        //key value pair - we using Map.
        //Map is not class, its interface, interface can not create object, thats why we have HashMap.

        Map<String, Integer> studentInfos = new HashMap<>();
        studentInfos.put("lela", 85);
        studentInfos.put("giorgi", 100);
        studentInfos.put("levani", 70);
        System.out.println(studentInfos); //not printing in order.

        //map.entry - writing first way to print key value pair
        //entryset - allows to iterate through the map.
         for (Map.Entry<String, Integer> studentInfo : studentInfos.entrySet()) {
            System.out.println(studentInfo.getKey() + "  -  " + studentInfo.getValue());
        }

        //map.of - when u know values in advance. We can not add from this map.
        Map<String, Integer> studentInfos2 = Map.of(
                "lela",60,
                "levani", 100,
                "tamo", 85,
                "lika", 100);
        System.out.println(studentInfos2);

        //LinkedHashMap - it will print in order.
        Map<String, Integer> studentInfos3 = new LinkedHashMap<>();
        studentInfos3.put("lela", 70);
        studentInfos3.put("ana", 100);
        studentInfos3.put("zaza", 90);
        System.out.println(studentInfos3);

        //TreeMap - it will print in order by key. Do not forget that front letters was upper or lower.
        Map<String, String> citiesAndCountries = new TreeMap<>();
        citiesAndCountries.put("Tbilisi", "Georgia");
        citiesAndCountries.put("Khashuri", "Georgia");
        citiesAndCountries.put("Batumi", "Georgia");
        System.out.println(citiesAndCountries);



    }
}
