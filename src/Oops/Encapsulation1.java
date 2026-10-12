package Oops;

public class Encapsulation1 {
    public static void main(String[] args) {
Car1 c= new Car1();

c.setBrand("Yamha");
c.getBrand();
c.drive();
c.start();

Bike1 b= new Bike1();
b.ride();
b.setBrand("honda");
b.drive();
b.start();
    }
}
class Vehicle1 {
    private String brand;

    public void setBrand(String brand){
        this.brand=brand;
    }

    public String getBrand() {
        return brand;
    }
    void start(){
        System.out.println(brand+ "vehicle is start");
    }
}
class Car1 extends Vehicle1{
    void drive(){
        System.out.println("car is driving");
    }
}

class Bike1 extends Car1{
    void ride(){
        System.out.println("bike is riding");
    }
}