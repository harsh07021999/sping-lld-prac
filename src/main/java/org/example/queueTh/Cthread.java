package org.example.queueTh;

public class Cthread extends Thread{

    Cthread(String name){
        super(name);
    }
    @Override
    public void run(){
        for(int i = 0;i< 5;i++){
            System.out.println(Thread.currentThread()+ " in cthread "+i);
        }
    }
}
