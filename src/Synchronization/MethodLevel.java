package Synchronization;

public class MethodLevel {
    public static void main(String[] args) {
      Hello2 h1=new Hello2();
      Hello2 h2=new Hello2();
       M1Thread th1 = new M1Thread(h1);
       M1Thread th2 = new M1Thread(h1);
       th1.start();
       th2.start();

    }
}
class M1Thread extends Thread{
    Hello2 h=null;
    M1Thread(Hello2 h){
        this.h=h;
    }
    public void run(){
        h.show();
    }
}
class Hello2{
    synchronized static void show(){
        Thread th= Thread.currentThread();
        for (int i=0; i<5;i++){
            System.out.println(th.getName()+" -SHOW:"+i);
            try {
                Thread.sleep(500);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
