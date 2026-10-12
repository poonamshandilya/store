package ExceptionHandling;

public class Lab744 {
    public static void main(String[] args) {
        System.out.println("main started");
        try (
            JLCResource2 res1 = new JLCResource2(1);
            JLCResource2 res2 =new JLCResource2(2);
        ){

        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println("main ends");
    }
}
class JLCResource2 implements AutoCloseable{
    int id;
    JLCResource2(int id){
        this.id=id;
    }
    public void close(){
        System.out.println("JLCResource2 closed:" +id);
    }
}
