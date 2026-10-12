package Basic.com;

class Inheritence{
    public static void main(String[] args) {
        Child obj = new Child();
    }

}
class Parent{
    int a;
    int b;
    Parent(){
        System.out.println("parent constructor");
    }
  Parent(int a, int b){
        this.a=a;
        this.b=b;
      System.out.println("parametrized constructor");
  }

}
class Child extends Parent{
    Child(){
        super();
    }

}



