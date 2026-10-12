package Langpackage;

public class Lab611 {
    public static void main(String[] args) {
        System.out.println("main started");
        Runtime rt = Runtime.getRuntime();
        System.out.println("T:" + rt.totalMemory());
        System.out.println("M:" + rt.maxMemory());
    }
}
