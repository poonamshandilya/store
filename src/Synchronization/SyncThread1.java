package Synchronization;

public class SyncThread1 {
    public static void main(String[] args) {
        Hello h1=new Hello();
        Hello h2=new  Hello();
        SynchThread th1 =  new SynchThread(h1);
        SynchThread th2=new SynchThread(h1);
        th1.start();
        th2.start();
    }
}
class SynchThread  extends Thread{
    Hello h=null;
    SynchThread(Hello h){
        this.h=h;
    }
    public void run(){
        h.show();
    }
}
class Hello{
    synchronized void show(){
        Thread th=Thread.currentThread();
        for (int i=0; i<5;i++){
            System.out.println(th.getName()+" -SHOW:"+"\t"+this);
            try {
                Thread.sleep(500);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}

