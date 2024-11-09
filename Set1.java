package com.apj;
import java.util.*;
public class Set1
 {
    public static void main(String[] args) {
        Set<Integer> s = new LinkedHashSet<Integer>();
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(4);
        s.add(5);
        s.add(6);


        Set<Integer> s2 = new LinkedHashSet<Integer>();
        s2.add(11);
        s2.add(2);
        s2.add(33);
        s2.add(4);
        s2.add(55);
        s2.add(6);

        s.addAll(s2);
        System.out.println("union of set 1 and 2 are" +s);

        s.removeAll(s2);
        System.out.println("difference of set 1 and 2 are" +s);

        s.retainAll(s2);
        System.out.println("interaction of set 1 and 2 are" +s);

    }
    
}
