package Oops;

public class Abtraction2 {
    public static void main(String[] args) {
        Vehiclex vehiclex = new Bikex();
        vehiclex.start();

        Bikex b=new Bikex();
        b.dirve();
        b.ride();b.start();
        Carx c= new Carx();
        c.dirve();
        c.start();


    }
}
interface Vehiclex {
    int speed=200;
    void start();

}
class Carx implements Vehiclex {

    @Override
    public void start() {
        System.out.println("Car is start speed"+ speed);
    }
    void dirve() {
        System.out.println("Car is  driving");
    }
}
class Bikex extends Carx implements Vehiclex{


    @Override
    public void dirve() {
        System.out.println("bike is drive");
    }

    @Override
    public void start() {
        System.out.println("bike is start");
    }
    void ride(){
        System.out.println("bike is riging");
    }
}
