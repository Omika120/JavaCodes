package com.apj;
import java.util.Scanner;
public class Infoemp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Employee Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Employee Post: ");
        String post = scanner.nextLine();

        System.out.print("Enter Employee Salary: ");
        int salary = scanner.nextInt();

        Employee emp = new Employee();
        emp.setinfo(name, post, salary); 

        // Show the employee information
        emp.showinfo();
        scanner.close();
    }
}
