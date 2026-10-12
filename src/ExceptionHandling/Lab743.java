package ExceptionHandling;

/*public class Lab743 {
    public static void main(String[] args) {
        System.out.println("main started");
        JLCResource1 res1=null;
        JLCResource1 res2=null;
        try (
            res1 =new JLCResource1(1);
            res2 = new JLCResource1(2);
        ){

        }catch(Exception e){
            System.out.println(e);
        }
        System.out.println("main ends");
    }
}
class JLCResource1 implements AutoCloseable{
    int id;
    JLCResource1(int  id){
        this.id=id;
    }
    public void close(){
        System.out.println("JLCResource1 closed:" +id);
    }
}

*/