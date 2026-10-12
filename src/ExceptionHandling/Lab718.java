package ExceptionHandling;

public class Lab718 {
    public static void main(String[] args) {
        System.out.println("main started");
        try {
            String data=args[0];
            int x=Integer.parseInt(data);
            int res =10/x;
            System.out.println("result: +res");
        }catch (ArrayIndexOutOfBoundsException | NumberFormatException | ArithmeticException e){
            System.out.println("Provide one non zero int value as CLA");
        }
        System.out.println("main completed");
    }
}
