package ExceptionHandling;

import java.rmi.StubNotFoundException;

public class Lab737 {
    public static void main(String[] args) {
        System.out.println("main started");
        String nm="";
        try {
            StudentService serv=new StudentService();
            nm=serv.getNameBySid("JLC-099");
            System.out.println("Name:"+nm);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("main completed");
    }
}
class EmptySidException extends RuntimeException{

}
    class StudentService{
        String getNameBySid(String sid) throws StubNotFoundException {
            if (sid==null)
                throw new NullPointerException();
            else if (sid.isEmpty()) throw new EmptySidException();

            else if (sid.equals("JLC-099"))
                return "srinivas";
            else
                throw new StubNotFoundException(sid);
        }
    }
    class StudentNotFoundException extends RuntimeException{
        StudentNotFoundException(String sid){
            super(sid);
        }
    }

