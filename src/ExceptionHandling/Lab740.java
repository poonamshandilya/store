package ExceptionHandling;

public class Lab740 {
    public static void main(String[] args) throws StudentNotFoundException{
            System.out.println("main starts");
            StudentService3 serv=new StudentService3();
            serv.getNameBySid(null);
            System.out.println("main ends");
        }
    }
    class StudentService3{
    String getNameBySid(String sid)throws StudentNotFoundException{
        if (sid ==null || sid.isEmpty() || !sid.equals("JLC-099"))
            throw new StudentNotFoundException(sid);
        else
            return  "srinivas";
    }
    }
    class StudentNotFoundException3 extends Exception{
    StudentNotFoundException3(String  sid){
        super(sid);
    }
    }

