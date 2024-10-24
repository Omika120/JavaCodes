package com.apj;


public class Bank{
    public double amount;

    public Bank(double amount) {
        this.amount = amount;
    }

    public void withdraw(double withdrawalAmount){
        System.err.println((withdrawalAmount<= amount)
        ?"withdrawal successful"
        :"withdrawal unsuccessful");



        if(amount>=withdrawalAmount)
        {
            amount-=withdrawalAmount;
        }

    }
    public void deposit(double depositAmount){
        amount+=depositAmount;
        System.out.println("Total balance:"+amount);
    }

    public static void main(String []args){
        Bank account = new Bank(10000);
        account.withdraw(5000);
        account.deposit(2000);


    }

    
}
