package Has_A_relationship;

public class Has {
    public static void main(String[] args) {
     Car car = new Car();
     car.drive();
    }
}
class Engine{
    void start(){
        System.out.println("engine satrt");
    }
}
class Car{
    Engine engine;
    Car(){
        engine=new Engine();
    }
    void drive(){
        engine.start();
        System.out.println("car is driving");
    }

}
