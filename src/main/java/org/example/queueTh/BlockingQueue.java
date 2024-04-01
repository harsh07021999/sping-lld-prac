package org.example.queueTh;

import java.util.LinkedList;
import java.util.Queue;

public class BlockingQueue {

    private Queue<Integer> q;

    private int cap;

    public BlockingQueue(int cap){
        this.cap = cap;
        this.q = new LinkedList<>();
    }

    public boolean add (int val){
        synchronized (q){
            while(q.size() == cap){
                try {
                    q.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            q.add(val);
            q.notifyAll();
            cap++;
            return true;
        }
    }

    public int remove()  {
        synchronized (q){
            while (q.isEmpty()){
                try {
                    q.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            Integer ans = q.poll();
            q.notifyAll();
            cap --;
            return ans;
        }
    }
}
