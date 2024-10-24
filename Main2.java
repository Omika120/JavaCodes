package com.apj;
import java.util.Scanner;

//super class: Animal
class Animal {
    public void makeSound(){
        System.out.println("The animal makes a sound.");
    }
}

//subclass 1: Dog
class Dog extends Animal{
    //override
    public void makeSound(){
        System.out.println("The dog barks...");
    }
}

//subclass 2: Cat
class Cat extends Animal{
    //override
    public void makeSound(){
        System.out.println("The cat meows...");
    }
}

public class Main2{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        //Allowing user to create and display object of each class.
        System.out.println("Enter 1 for Dog, 2 for Cat, 3 for Generic animal: ");
        
        int choice=sc.nextInt();
        switch (choice) {
            case 1:
                Dog D= new Dog();
                D.makeSound();
                break;
            
            case 2:
                Cat C= new Cat();
                C.makeSound();
                break;

            case 3:
                Animal A= new Animal();
                A.makeSound();
                break;
        
            default:
                System.out.println("Invalid choice");
                break;
        }

        sc.close();

    }
}
