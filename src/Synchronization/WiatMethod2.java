package Synchronization;

import java.util.ArrayList;

public class WiatMethod2 {
    public static void main(String[] args) {
        Hello5 h1 = new Hello5();
        M4Thread th1 = new M4Thread(h1);
        M4Thread th2 = new M4Thread(h1);
        th1.start();
        th2.start();
    }
}
class M4Thread extends Thread{
    Hello5 h;
    M4Thread(Hello5 h){
        this.h=h;

    }
    public void run(){
        h.show();
    }
}
class Hello5{
    void show(){
        ArrayList al = new ArrayList();
        Thread th = Thread.currentThread();
        synchronized(al){
            for (int i=0;i<=5;i++){
                try {
                    wait(1000);
                    System.out.println(th.getName()+" -SHOW:"+"\t"+this);
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
    }
}
