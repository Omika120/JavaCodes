package com.apj;

public class Employee {
    String name;
    String post;
    int salary;

    private void getinfo(String name, String post, int salary)
    {
        this.name=name;
        this.post=post;
        this.salary=salary;

    }

    public void showinfo(){
        System.out.println("Name:"+name);
        System.out.println("Post:"+post);
        System.out.println("Salary:"+salary);

    }
    public void setinfo(String name, String post, int salary) {
        getinfo(name, post, salary); 
    }

}


