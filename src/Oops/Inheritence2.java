package Oops;

public class Inheritence2 {
    public static void main(String[] args) {
Car c=new Car();
Bike b= new Bike();

c.dirve();
c.strat();
b.ride();
b.dirve();
b.strat();
    }
}
class Vehicle{
    void strat(){
        System.out.println(" vehicle is start");
    }
}
class Car extends Vehicle{
    void dirve(){
        System.out.println("car is driving");
    }
}
class Bike extends Car{
    void  ride(){
        System.out.println("bike can ride");
    }
}
