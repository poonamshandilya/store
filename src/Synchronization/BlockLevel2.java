package Synchronization;

public class BlockLevel2 {
    public static void main(String[] args) {
        Hello3 h1 = new Hello3();
        Hello3 h2 = new Hello3();
        M2Thread th1 = new M2Thread(h1);
        M2Thread th2 = new M2Thread(h1);
        th1.start();
        th2.start();
    }
}
class M2Thread extends Thread{
    Hello3 h= null;
    M2Thread(Hello3 h){
        this.h=h;
    }
    public void run(){
        h.show();
    }
}
class Hello3 {
    static void show(){
        Thread th= Thread.currentThread();
        synchronized (Hello3.class){
            for (int i=0;i<5;i++){
                System.out.println(th.getName()+" -SHOW:"+i);
                try {
                    Thread.sleep(500);
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
    }
}
