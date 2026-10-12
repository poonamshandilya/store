package PracticeProgram;

public class Thread1 {
    public static void main(String[] args) {
 ThreadGroup tg=new ThreadGroup("JLc");
MyThread1 t1=new MyThread1(tg,"Hello");
MyThread1  t2=new MyThread1(tg,"Hai");
    }
}
class MyThread1 implements Runnable{
MyThread1(ThreadGroup tg,String tname){
    //super(tg,tname);
    //start();
    Thread t=new Thread(tg,this,tname);
    
    t.start();
}
public void run(){
    Thread th=Thread.currentThread();
    ThreadGroup tg=th.getThreadGroup();
    System.out.println("Thread name"+th.getName());
    System.out.println("Thread group name"+tg.getName());
}
}
