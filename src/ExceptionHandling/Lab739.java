package ExceptionHandling;

public class Lab739 {
    public static void main(String[] args) {
        System.out.println("Main starts");
        try {
            StudentService2 serv = new StudentService2();
            serv.getNameBySid(null);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("Main ends");
    }
}
class StudentService2{
    String getNameBySid(String sid)throws StudentNotFoundException{
        if (sid==null || sid.isEmpty() || !sid.equals("JLC-099"))
            throw new StudentNotFoundException(sid);
        else
            return  "srinivas";
    }
}
class StudentNotFoundException2 extends Exception{
    StudentNotFoundException2(String sid){
        super(sid);
    }
}
