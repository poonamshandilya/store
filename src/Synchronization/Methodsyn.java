package Synchronization;

public class Methodsyn {
    public static void main(String[] args) {
Table t = new Table();
Thread th = new Thread();
Thread th2 = new Thread();
t.show(20);
t.show(30);
th.start();


    }
}
class Table {

    synchronized  void show(int n){
        Thread th= Thread.currentThread();
        for (int i=0; i<5;i++){
            System.out.println(n*i);
            try {
                Thread.sleep(500);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}

