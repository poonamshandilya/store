package ExceptionHandling;

public class Lab713a {
    public static void main(String[] args) {
        System.out.println("main started");
        try {
            String data=args[0];
            int x=Integer.parseInt(data);
            int res = 10/x;
            System.out.println("result:" +res);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("provide one value as CLA");
        }catch (NumberFormatException e){
            System.out.println("provid int value as CLA");
        }catch (ArithmeticException e){
            System.out.println("provide non zero int value as CLA");
        }catch (Exception e){
            System.out.println("provide correct value");
        }
        System.out.println("main completed");
    }
}
