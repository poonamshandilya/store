package ExceptionHandling;

public class Lab749 {
    public static void main(String[] args) {
        Student sarr[] = new Student[500];
        try {
            for (int i=0; i< sarr.length; i++){
                sarr[i] = new Student();
                System.out.println((i + 1)+"Object created");
            }
        }catch (Error e){
            System.out.println("\n**Error Occured:"+e);
        }
        System.out.println("\nAfter Handling");
        Student st = new Student();
    }
}
class Student  {
    long arr[] = new long[215833];
}
