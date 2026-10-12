package Synchronization;



/*public class WaitMethod3 {
    public static void main(String[] args) {
        Hello6 h1 = new Hello6();
        M5Thread th1 = new M5Thread(h1);
        M5Thread th2 = new M5Thread(h1);
        th1.start();
        th2.start();
    }
}
class M5Thread extends Thread{
    Hello6 h;
    M5Thread(Hello6 h){
        this.h=h;
    }
    public void run(){
        h.show();

    }
}
class Hello6 {
    void show(){
        ArrayList al = new ArrayList();
        Thread th = Thread.currentThread();
        synchronized (al){
            for (int i=0;i<=5;i++){
                try {
                    wait(1000);
                    al.wait(1000);
                    System.out.println(th.getName()+" -SHOW:"+i+"\t+this");
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
    }
}*/
