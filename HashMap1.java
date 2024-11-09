package com.apj;
import java.util.Collection;
import java.util.HashMap;

public class HashMap1 {
    public static void main(String[] args) {
        HashMap<String,String> a= new HashMap<>();
        a.put("name", "Omika");
        a.put("class", "XII");
        a.put("hOBBY", "Chess");
        a.put("Branch", "CSE");

        System.out.println(a.get("name"));
        System.out.println(a.get("hOBBY"));

        Collection<String> values= a.values();
        System.out.println(values);

        for (String value: values){
            
            System.out.println(value);

        }

        Collection<String> keys= a.keySet();
        System.out.println(keys);

        for (String key: keys){
            
            System.out.println(key);
            
        }

        for (String key: keys){
            
            System.out.println(key + " : " + a.get(key));
            
        }
    }
    
}
