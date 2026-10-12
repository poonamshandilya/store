package PracticeProgram;

public class ExceptionHandling {
    public static void main(String[] args) {
        System.out.println("Main Started");
       /* try {
            String data=args[0];
            int x=Integer.parseInt(data);
            int res=10/x;
            System.out.println("Result"+res);
        }catch (ArrayIndexOutOfBoundsException  | NumberFormatException | ArithmeticException e){
            System.out.println("Provide one non zero int value as CLA");
        }
        System.out.println("MAin completed");
String data=null;
try {
    data=args[0];
}catch (ArrayIndexOutOfBoundsException e){
    System.out.println("provide one value as a CLA");
}

int x=0;
try {
    x=Integer.parseInt(data);
}catch (NumberFormatException e){
    System.out.println("provide int value as CLA");
}
try {
    int res=10/x;
    System.out.println("Result"+res);

}catch (ArithmeticException  e){
    System.out.println("provide non zero int value as CLA");

}
        System.out.println("Main completed");*/
        try {
            int res=10/3;
            System.out.println("result"+res);
            return;

        }catch (Exception e){
            System.out.println("invalid input");
        }
        finally {
           // System.out.println("finally block");
            System.out.println("main completed");
        }

    }
}
