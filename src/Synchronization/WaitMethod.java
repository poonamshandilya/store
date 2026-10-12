package Synchronization;

public class WaitMethod {
    public static void main(String[] args) {
        Hello4 h1=new Hello4();
        M3Thread th1 = new M3Thread(h1);
        M3Thread th2 = new M3Thread(h1);
        th1.start();
        th2.start();
    }
}
class M3Thread extends Thread{
    Hello4 h;
    M3Thread(Hello4 h){
        this.h=h;
    }
    public void run(){
        h.show();
    }
}
class Hello4 {
    synchronized void show(){
        Thread th = Thread.currentThread();
        for (int i=0;i<5;i++){
            try {
                wait(1000);
                System.out.println(th.getName()+" -SHOW:"+"\t"+this);
            }catch (Exception  e){
                e.printStackTrace();
            }
        }
    }
}
