package PracticeProgram;

public class Throw {
    public static void main(String[] args) throws StubNotFoundException{
        System.out.println("Main started");
        //String nm="";
        //try {
            StudentService srv=new StudentService();
            srv.getNameBySid(null);
            //System.out.println("Name"+nm);
        //}catch (Exception e){
            //e.printStackTrace();
        //}
        System.out.println("Main completed");
    }
}
//class EmptySidException extends RuntimeException{}

class StudentService{
    String getNameBySid(String sid)throws StubNotFoundException{
        if (sid==null || sid.isEmpty() || sid.equals("JLC-099"))
            /*throw new NullPointerException();
        else if (sid.isEmpty())
            throw new EmptySidException();
        else if (sid.equals("JLC-099"))
            return "Srinivas";
        else*/
            throw new StubNotFoundException(sid);
            else
            return "Srinivas";
    }
}
class StubNotFoundException extends Exception{
    StubNotFoundException(String sid){
        super(sid);
    }
}
