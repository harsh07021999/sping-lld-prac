package org.example.singleton;

public class TVSingle {
    private static volatile TVSingle tvSingle = null;
    private TVSingle(){
        System.out.println("INIT Singleton");
    }
    public static TVSingle getTvSingle(){
        if(tvSingle == null){
            synchronized (TVSingle.class){
                if(tvSingle == null) {
                    tvSingle = new TVSingle();
                }
            }
        }
        return tvSingle;
    }
}
