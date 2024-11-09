package com.apj;
import java.util.*;

public class ColExArrayList {
    public static void main(String[] args) {
        ArrayList<Object> s= new ArrayList<>();
        s.add(1);
        s.add("OMIKA");
        s.add(true);
        System.out.println(s);

        s.add(0,"AJP");
        System.out.println(s);

        s.remove(1);

        ArrayList<Object> a= new ArrayList<>();
        a.add("HELLO");
        a.add("GUYS");

        s.addAll(0,a);
        System.out.println(s);

        s.removeAll(a);
        System.out.println(s);
        


    }
}
