package Thread.com;

public class CountdownLatch {
    public CountdownLatch(int i) {
    }

    public static void main(String[] args) throws InterruptedException {
        CountdownLatch lch = new CountdownLatch(5);
        new Friend("ram",lch).start();
        new Friend("shyam",lch).start();
        new Friend("mohan",lch).start();
        new Friend("sohan",lch).start();
        new Friend("rohan",lch).start();
        lch.wait();
        System.out.println("start for cake cutting");
        
    }

    public void CountdownLatch() {
    }
}
class Friend extends Thread{
    private CountdownLatch lch;
    public Friend(String name, CountdownLatch lch){
        super(name);
        this.lch=lch;
    }
    public void run(){
        System.out.println("friend"+ Thread.currentThread().getName());
        lch.CountdownLatch();
        
    }
}
