package PracticeProgram;

public class Functionali {
    public static void main(String[] args) {
  Calculater cal = (a,b)-> a+b;
        System.out.println("addition"+ cal.add(10,20));
        Printer printer = message -> System.out.println("message"+message);
        printer.print("hello lambda");
    }
}
interface Calculater{
    int add(int a,int b);
}
interface Printer{
    void print(String message);
}
