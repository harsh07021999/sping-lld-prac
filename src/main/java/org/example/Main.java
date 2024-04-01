package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        System.out.println("Starting Daemon thread");
        SpringApplication.run(Main.class);

//        Thread one = new Cthread("Thread 1");
//        one.start();
//        one.setDaemon(true);
//        Thread two = new Thread(new CthreadRun(), "runnable1");
//        two.start();
//        Thread three = new Thread( ()->{
//            for(int i=0;i<5;i++){
//                System.out.println(Thread.currentThread()+" current runnable "+i);
//            }
//        },"runnable2");
//        three.start();
//        System.out.println("Ending Daemon thread");
//
//        Stack s = new Stack(5);
//
//        new Thread(()->{
//            int c = 0;
//            while (++c<= 6){
//                System.out.println("Pushed " + s.push(c));
//            }
//        },"Pusher").start();
//        new Thread(()->{
//            int c = 0;
//            while(++c <=6){
//                System.out.println("Popper " + s.pop());
//            }
//        },"Popper").start();
//
//        new Thread(()->{
////            TVSingle tv;
//            System.out.println(Thread.currentThread().getName() + TVSingle.getTvSingle());
//        },"t1").start();
//        new Thread(()->{
////            TVSingle tv;
//            System.out.println(Thread.currentThread().getName() + TVSingle.getTvSingle());
//        },"t2").start();

    }
}