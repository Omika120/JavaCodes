package com.apj;
import java.util.*;
public class SwitchGreetings {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter 1. for hindi , 2. for english and 3. for french");
        int choice= sc.nextInt();
        switch(choice){
            case 1:
            {
                System.out.println("Namaste ");
                break;
            }
            case 2:
            {
                System.out.println("Hello");
                break;
            }
            case 3:
            {
                System.out.println("Bonjour");
                break;
            }
            default:
            {
                System.out.println("INVALID CHOICE");
            }
            sc.close();

        }
    }
}
