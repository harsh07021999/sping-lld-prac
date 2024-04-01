package org.example.queueTh;

public class CthreadRun implements Runnable{
    @Override
    public void run(){
        for(int i = 0;i< 5;i++){
            System.out.println(Thread.currentThread()+" in cthread "+i);
        }
    }
}
