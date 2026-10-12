package ExceptionHandling;

public class Lab742 {
    public static void main(String[] args) {
        System.out.println("main started");
        JLCResource res1=null;
        JLCResource res2 =null;
        try {
            res1=new JLCResource(1);
            res2=new  JLCResource(2);
        }catch (Exception e){
            System.out.println(e);
        }finally {
            if (res2 !=null)
                res2.close();
            if (res1 !=null)
                res1.close();
        }
        System.out.println("main ends");
    }
}
class JLCResource implements AutoCloseable{
    int id;
    JLCResource(int id){
        this.id=id;
    }
    public void close(){
        System.out.println("JLCResource close:" +id);
    }
}
