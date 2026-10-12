package Synchronization;

public class Lab764 {
    public static void main(String[] args) {
       Helloo h = new Helloo();
       Helloo h2 = new Helloo();
       MyThread th1 = new MyThread(h);
       MyThread th2 = new MyThread(h);
       th1.start();
       th2.start();
    }
}
class MyThread extends Thread{
    Helloo h = null;
    MyThread(Helloo h){
        this.h=h;
    }
    public void run(){
        h.show();
    }
}
class Helloo {
    synchronized void show(){
        Thread th = Thread.currentThread();
        for (int i=0;i<5;i++){
            System.out.println(th.getName()+" show " +i+"\t"+this);
            try {
                Thread.sleep(500);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
