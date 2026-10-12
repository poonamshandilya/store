package ExceptionHandling;

public class Lab746 {
    public static void main(String[] args) {
        System.out.println("mai starts");
        try(JLCResource4 res = new JLCResource4();){
            int x=10/0;
        }
        System.out.println("main ends");
    }
}
class JLCResource4 implements AutoCloseable{
    public  void  close(){}
}
