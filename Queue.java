package com.apj;
class Queue {
    int x;
    void store(int j)
    {
        x=j;
        System.out.println("produced: "+x);
    }
    void retrieve()
    {
        System.out.println("Consumed: "+x);
    }
}

class Producer extends Thread
{
    Queue a ; //referense to queue class which is pointing to queue object
    Producer (Queue q)
    {
        a=q;
    }
    public void run()
    {
        int i=1;
        for(int z=1;z<50;z++)
        {
            a.store(i++);
        }
    }
}
class Consumer extends Thread
{
    Queue b ; //referense to queue class which is pointing to queue object
    Consumer(Queue q)
    {
        b=q;
    }
    public void run()
    {
        for(int z=1;z<50;z++)
        {
            b.retrieve();
        }
    }
}

class Demo
{
    public static void main(String[] args) {
        Queue q = new  Queue();
        Producer p = new Producer(q);
        Consumer c = new Consumer(q);
        p.start();
        c.start();

    }
}
