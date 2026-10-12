package Oops;

public class ThreadE {
    public static void main(String[] args) {
MyThread th1 = new MyThread();
//MyThread2 th2 = new MyThread2();
th1.start();
//th2.start();
    }
}
class MyThread extends Thread{
    public void run(){
        String s ="Hii";
        String s2 = "byee";
        for (int i=0;i<=10;i++){
            System.out.println(s);
            System.out.println(s2);
        }
    }

}
//class MyThread2 extends Thread{
//    public void run(){
//        String s2 = "Byee";
//        for (int j=0;j<=10;j++){
//            System.out.println(s2);
//        }
//    }
//}
