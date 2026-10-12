package Oops;

public class Inheritence1 {
    public static void main(String[] args) {

     Dog d = new Dog();
     PetDog pd = new PetDog();

     d.bark();
     d.eat();

     pd.sleep();
     pd.bark();
     pd.eat();

    }
}

  class Animal{
    void eat(){
        System.out.println("animal can eat");
    }
  }
  class Dog extends Animal{
    void bark(){
        System.out.println("Dog can bark");
    }
  }
  class PetDog extends Dog{
    void sleep(){
        System.out.println("petdog can sleep");
    }
  }