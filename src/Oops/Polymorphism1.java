package Oops;

public class Polymorphism1 {
    public static void main(String[] args) {
        Vehicle2 v= new Car2();
        v.start();
       v= new Bike2();
        v.start();
       Car2 c= new Bike2();
       c.drive();
    }
}
class Vehicle2 {
    void start(){
        System.out.println("vehicle is start");
    }
}
class Car2 extends Vehicle2{
    void start(){
        System.out.println("car is start");
    }
    void drive(){
        System.out.println("car is driving");
    }
}
class Bike2 extends Car2{
    void start(){
        System.out.println("bike is start");
    }
    void drive(){
        System.out.println("bike is driving");
    }
    void  ride(){
        System.out.println("bike is riding");
    }
}
