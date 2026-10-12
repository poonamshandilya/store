package PracticeProgram;

public class Threading {
    public static void main(String[] args) {
        System.out.println("Main started");
        MyThread th=new MyThread();
       // MyThread t2=new MyThread();
        Thread t1=new Thread(th);
         Thread  t2=new Thread(th);

        t1.start();   t2.start();
        Thread t= Thread.currentThread();
        for (int i=100;i<=110;i++){
          System.out.println(t.getName()+ "- value is"+ i);
           try {
               Thread.sleep(500);
           }catch (Exception e){
              e.printStackTrace();
            }
        }
       /* Thread th=Thread.currentThread();
        ThreadGroup tg=th.getThreadGroup();
        System.out.println(th.getName()+"\t"+th.getName()+"\t"+tg.getName());
        for (int i=0;i< args.length;i++){
            String st=args[i];
            System.out.println(th.getId()+"\t"+th.getName()+"\t"+tg.getName()+"\t"+st);
        }
        System.out.println("Main completed");*/
    }
}
class MyThread implements Runnable{
    public void run(){
        Thread th=Thread.currentThread();
        for (int i=0;i<=10;i++){
            System.out.println(th.getName()+ "-value is" + i);
            try {
                Thread.sleep(500);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
