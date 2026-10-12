package Langpackage;

public class Lab695 {
    public static void main(String[] args)throws Exception {
//        Runtime rt = null;
//        System.out.println(Runtime.getRuntime());
//        System.out.println(Runtime.getRuntime());
//        rt=Runtime.getRuntime();
//        System.out.println(rt.availableProcessors());
//        System.out.println(rt.maxMemory());
//        System.out.println(rt.totalMemory());
//        System.out.println(rt.freeMemory());

        Runtime rt= Runtime.getRuntime();
        Process p = rt.exec("mspaint");


    }
}
