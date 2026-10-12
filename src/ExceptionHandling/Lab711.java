package ExceptionHandling;

public class Lab711 {
    public static void main(String[] args) {
        System.out.println("Main Started");
        try {
            String data =  args[0];
            int x=Integer.parseInt(data);
            int rest = 10/x;
            System.out.println("Result:+res");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("provide one value as CLA");
        }catch (NumberFormatException e){
            System.out.println("Provide int value as CLA");
        }catch (ArithmeticException  e){
            System.out.println("provide non value as a CLA");
        }
        System.out.println("Main completed");
    }
}
