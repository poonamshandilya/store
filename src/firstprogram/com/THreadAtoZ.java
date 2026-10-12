package firstprogram.com;

public class THreadAtoZ {
    public static void main(String[] args) {
        Ram r = new Ram();
        Shyam s = new Shyam();
        r.start();
        s.start();
    }
}
class Ram extends Thread{
    public void run(){
        for (int i=0;i<=10;i++){
            System.out.println("ram" + i);
        }
    }
}
class Shyam extends Thread{
    public void run(){
        for (char ch='a'; ch<='z'; ch++){
            System.out.println("shyam " +ch);
        }
    }
}
