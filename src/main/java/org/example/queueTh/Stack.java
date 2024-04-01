package org.example.queueTh;

import java.net.http.HttpClient;

public class Stack {

    private int [] values;

    private int top;


    public Stack(int cap) {
        this.top = -1;
        this.values = new int[cap];
    }

    public synchronized boolean isEmpty(){
        return this.top < 0;
    }
    public boolean isFull(){
        return this.top > values.length -1;
    }
    public synchronized boolean push(int val){
//        HttpClient.newHttpClient().
        if (this.isFull()) {
            return false;
        }
        top += 1;
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            throw new RuntimeException(e.getCause());
        }
        this.values[top] = val;
        return true;
    }
    public synchronized int pop(){
            if (this.isEmpty()) {
                return Integer.MIN_VALUE;
            }

            int ans = values[top];
            values[top] = Integer.MIN_VALUE;
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                throw new RuntimeException(e.getCause());
            }
            top -= 1;
            return ans;
    }
}
