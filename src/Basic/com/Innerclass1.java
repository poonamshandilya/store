package Basic.com;

/*public class Innerclass1 {
    public static void main(String[] args) {
       // A.B outb = new A().new B();
       // outb.display();

        A obj = new A();
        A.B bobj= obj.new B();
        bobj.display();
    }
}
class A{
    private int a = 10;
    class B{
        void display(){
            System.out.println(a);
        }
    }
}*/

/*class Innerclass1{
    public static void main(String[] args) {

        A.B obj = new A.B();
        obj.show();
    }

}
class A{
    static class B{
        void show(){
            System.out.println("static inner class");
        }

    }
}*/

/*class Innerclass1{
    public static void main(String[] args) {
        A obj= new A();
     obj.display();
    }
}
class A{
    void display(){
        System.out.println("hii");
    }
    void m1(){
        class B{
            void show(){
                System.out.println("hello");
            }
        }
    }
}*/

/*class Innerclass1{
    public static void main(String[] args) {
        A a = new A(){
            void display(){
                System.out.println("AIC");
            }
        };
       B b = new B(){
           void show(){
               System.out.println("AOC");
           }
       };
a.display();
b.show();
    }
}
class A{
    void display(){
        System.out.println("A");
    }
        }
        class B{
    void show(){
        System.out.println("B");
    }
        }*/
