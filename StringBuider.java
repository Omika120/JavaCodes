package com.apj;
import java.util.*;

public class StringBuider {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        StringBuilder sb= new StringBuilder("Omika");
        System.out.println("Enter the surname: ");
        StringBuilder a= new StringBuilder();
        String b= sc.nextLine();
        a.append(b);

        System.out.println(sb.append(a));

        System.out.println(sb.insert(5, " "));

        sb.setCharAt(5, '@');
        System.out.println(sb);

        System.out.println(sb.delete(5,sb.length()));

        sc.close();

    }
}
