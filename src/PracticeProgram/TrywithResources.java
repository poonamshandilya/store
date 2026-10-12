package PracticeProgram;

public class TrywithResources {
    public static void main(String[] args) {
        System.out.println("Main started");
       /* try(
            JLCResource res =new JLCResource();
        ){

    //int x=10/0;
        }
        System.out.println("Main ends");*/
        Student sarr[]=new Student[500];
        try {
            for (int i=0; i<sarr.length;i++){
                sarr[i]=new Student();
                System.out.println((i+1)+"Object created");
            }
        }catch (Error e){
            System.out.println("\n**Error Occured"+e);
        }
        System.out.println("\nAfter Handling");
        Student st=new Student();
    }
}
        /*try (
              JLCResource  res1 = new JLCResource(1);
              JLCResource res2 = new JLCResource(2);
                ){

        }catch (Exception e){
            System.out.println(e);
        }//finally {
           // if (res2!=null)
            //    res2.close();
            //if (res1!=null)
               // res1.close();
       // }
        System.out.println("Main ends");
    }
}
class JLCResource {
    int id;
    JLCResource(int id){
        this.id=id;
    }
    public void close(){
        System.out.println("JLCResource closed"+id);
    }
}*/
    //class JLCResource implements AutoCloseable{
       // public void close(){}
   // }
class Student{
    long arr[]=new long[215833];
        }
