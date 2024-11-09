package com.apj;
import java.util.*;


public class HashMap2 {
    public static void main(String[] args) {
        HashMap<String,String> Hm= new HashMap<>();


        //entering specified key and value
        String Key= "Animal";
        String value= "Cat";

        Hm.put(Key,value);

        Hm.put("bird","Parrot");


        //seeing the key and specified value
        System.out.println("All keys and values in the HashMap:");
        for (String key : Hm.keySet()) {
            System.out.println(key + " : " + Hm.get(key));
        }

    }
}
