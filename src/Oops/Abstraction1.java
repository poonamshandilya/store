package Oops;

public class Abstraction1 {
    public static void main(String[] args) {
        Vehiclee vehiclee = new Bikee("yamha",200);
        vehiclee.start();
        Bikee bikee = new Bikee("Honda", 200);
        bikee.ride();
        bikee.drive();
        bikee.start();
        Carr car = new Bikee("Sujuki", 300);
        car.drive();
        
    }
}
abstract class Vehiclee {
   String brand;
   Vehiclee(String brand){
       this.brand=brand;
   }
    abstract void start();

}
abstract class Carr extends Vehiclee{
    int speed;
    Carr(String brand, int speed){
        super(brand);
        this.speed=speed;
    }
    void drive(){
        System.out.println(brand+"car is driving"+ speed);
    }

    public abstract void start();
}
class Bikee extends  Carr{
    Bikee(String brand,int speed){
        super(brand,speed);
    }
    @Override
    public void start(){
       System.out.println(brand+ "bike is start" + speed);
   }
    void ride(){
        System.out.println(brand+ "bike is riding" +speed);
    }
}