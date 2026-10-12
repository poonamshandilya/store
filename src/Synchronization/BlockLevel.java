package Synchronization;

/*public class BlockLevel {
    public static void main(String[] args) {
        Hello1 h1  =new Hello1();
        Hello1 h2=new Hello1();
        Mthread th1 = new Mthread(h1);
        Mthread th2 =new Mthread(h2);
        th1.start();
        th2.start();
    }
}
class Mthread extends Thread{
    Hello1 h=null;
    Mthread(Hello1 h){
        this.h=h;
    }
    public void run(){
        h.show();
    }
}
class Hello1 {
    void show(){
        Thread th= Thread.currentThread();
        synchronized (this){
            for (int i=0; i<5;i++);
            System.out.println(th.getName()+" -SHOW:"+i+"\t"+this);
            try {
                Thread.sleep(500);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}*/
